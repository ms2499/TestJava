package com.example.testjava;

import com.tandem.ext.enscribe.EnscribeFile;
import com.tandem.ext.enscribe.EnscribeFileException;
import com.tandem.ext.enscribe.EnscribeOpenOptions;
import com.tandem.ext.guardian.*;
import com.tandem.ext.util.DataConversionException;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;

public class TestJava {
    static Receive recv = null;
    static EnscribeFile FUMIND = null;

    public static void main(String[] args){
        ReceiveInfo ri = null;
        boolean moreOpeners = true;
        int countRead = 0;
        int countReply = 0;
        byte[] msg = new byte[2048];
        short sysNum = 0;

        openRecv();
        FUMIND = openFile("FUMIND");

        do {
            try {
                countRead = recv.read(msg, msg.length);
                ri = recv.getLastMessageInfo();

                if (ri.isSystemMessage()) {
                    /* 久沒新訊息 關閉server */
                    sysNum = ri.getSystemMessageNumber(msg);
                    if (sysNum != ReceiveInfo.SYSMSG_OPEN) {
                        System.out.println("exit process!");
                        if (FUMIND != null) FUMIND.close();
                        System.exit(1);
                    }
                }else {
                    /* 收到pathsend來的訊息 */
                    System.out.println("msg:" + new String(msg));
                    IpmHeader ipmHeader = new IpmHeader();
                    FUR211 sendData = new FUR211();

                    ipmHeader.setValue(msg);
                    sendData.setValue(msg, ipmHeader.getBytes().length - 2);

//                    Field[] fields = ipmHeader.getClass().getFields();
//                    for (Field field : fields) {
//                        System.out.println(field.toString() + " = " + field.get(ipmHeader));
//                    }
//
//                    fields = sendData.getClass().getFields();
//                    for (Field field : fields) {
//                        System.out.println(field.toString() + " = " + field.get(sendData));
//                    }
                    ReplyData replyData = new ReplyData();
                    switch (ipmHeader.functionCode) {
                        case 1: replyData = insertData(sendData); break;
                        case 2: replyData = updateData(sendData); break;
                        case 3: replyData = deleteData(sendData); break;
                        case 4: replyData = readFirst(sendData); break;
                        case 5: replyData = readNext(sendData); break;
                        case 6: replyData = read(sendData); break;
                    }

                    byte[] replyBytes = replyData.getBytes();
                    byte[] replyBody = sendData.getBytes();
                    byte[] replyArea = new byte[replyBytes.length + replyBody.length];
                    System.arraycopy(replyBytes, 0, replyArea, 0, replyBytes.length);
                    System.arraycopy(replyBody, 0, replyArea, replyBytes.length, replyBody.length);
                    System.out.println("hlen="+replyBytes.length);
                    System.out.println("blen="+replyBody.length);
                    System.out.println("alen="+replyArea.length);
                    countReply = recv.reply(replyArea, replyArea.length, GError.EOK);
                }
            }catch (ReceiveNoOpeners ex) {
                moreOpeners = false;
            }catch (GuardianException ex) {
                System.out.println(ex.getMessage());
            }catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }while (moreOpeners);
    }

    public static void openRecv() {
        try {
            recv = Receive.getInstance();
            recv.setSystemMessageMask(Receive.SMM_CLOSE | Receive.SMM_ABORTDIALOG | Receive.SMM_CANCEL);
            recv.open();
        }catch (GuardianException ex) {
            System.out.println("Open $Receive failed!");
            System.out.println(ex.getMessage());
            System.exit(1);
        }catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static EnscribeFile openFile(String fileName) {
        try {
            System.out.println("open file "+fileName);
            EnscribeFile ensFile = new EnscribeFile("/G/FU1/FUDATA/" + fileName);
            EnscribeOpenOptions openAttr = new EnscribeOpenOptions();
            openAttr.setAccess(EnscribeOpenOptions.READ_WRITE);
            openAttr.setExclusion(EnscribeOpenOptions.SHARED);
            ensFile.open(openAttr);
            System.out.println("open file success!");
            return ensFile;
        }catch (EnscribeFileException ensFileEx) {
            System.out.println("Open file " + fileName + " failed!, Guardian error = " + ensFileEx.getErrorNum());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ReplyData insertData(FUR211 sendData) {
        ReplyData replyData = new ReplyData();

        return replyData;
    }

    public static ReplyData updateData(FUR211 sendData) {
        ReplyData replyData = new ReplyData();

        return replyData;
    }

    public static ReplyData deleteData(FUR211 sendData) {
        ReplyData replyData = new ReplyData();

        return replyData;
    }

    public static ReplyData readFirst(FUR211 sendData) {
        IO_Fumind_r fumindR = new IO_Fumind_r();
        int countRead = 0;

        ReplyData replyData = new ReplyData();
        try {
            countRead = FUMIND.read(fumindR);
            if (countRead != -1) {
                sendData.setWsBrokerId(fumindR.getInd_broker_id());
                sendData.setWsIbNo(fumindR.getInd_ib_no());
                sendData.setWsIntroduceId(fumindR.getInd_introduce_id());
                sendData.setWsName(fumindR.getInd_name());
                sendData.setWsIdNo(fumindR.getInd_idno());

                Field[] fields = fumindR.getClass().getFields();
                for (Field field : fields) {
                    System.out.println(field.toString() + " = " + field.get(fumindR));
                }

                ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
                buffer.putLong(fumindR.getInd_date());
                ByteBuffer wrapper = ByteBuffer.wrap(buffer.array());
                sendData.setWsDate(wrapper.getInt());
                sendData.setWsPhoneNoO(fumindR.getInd_phone_no_o());
                sendData.setWsPhoneNoH(fumindR.getInd_phone_no_h());
                sendData.setWsEngName(fumindR.getInd_english_name());
                sendData.setWsAddr(fumindR.getInd_address());
                sendData.setWsOperUser(Integer.parseInt(fumindR.getInd_oper_user().trim()));
                sendData.setWsOperDate((int) fumindR.getInd_oper_date());

                replyData.replyMsg = "查詢完成";
            } else {
                replyData.replyCode = 999;
                replyData.replyMsg = "查無資料!";
            }
        } catch (EnscribeFileException e) {
            throw new RuntimeException(e);
        } catch (DataConversionException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return replyData;
    }

    public static ReplyData readNext(FUR211 sendData) {
        ReplyData replyData = new ReplyData();

        return replyData;
    }

    public static ReplyData read(FUR211 sendData) {
        ReplyData replyData = new ReplyData();

        return replyData;
    }
}
