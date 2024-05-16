package com.example.testjava;

import com.google.common.primitives.Bytes;
import lombok.Data;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Data
public class FUR211 {
    public String wsBrokerId;
    public String wsIbNo;
    public String wsIntroduceId;
    public String wsName;
    public String wsIdNo;
    public int wsDate;
    public String wsPhoneNoO;
    public String wsPhoneNoH;
    public String wsEngName;
    public String wsAddr;
    public int wsOperUser;
    public int wsOperDate;

    public void setWsBrokerId(String wsBrokerId) {
        this.wsBrokerId = String.format("%-7s", wsBrokerId);
    }

    public void setWsIbNo(String wsIbNo) {
        this.wsIbNo = String.format("%-3s", wsIbNo);
    }

    public void setWsIntroduceId(String wsIntroduceId) {
        this.wsIntroduceId = String.format("%-11s", wsIntroduceId);
    }

    public void setWsName(String wsName) {
        this.wsName = String.format("%-17s", wsName);
    }

    public void setWsIdNo(String wsIdNo) {
        this.wsIdNo = String.format("%-11s", wsIdNo);
    }

    public void setWsDate(int wsDate) {
        this.wsDate = wsDate;
    }

    public void setWsPhoneNoO(String wsPhoneNoO) {
        this.wsPhoneNoO = String.format("%-16s", wsPhoneNoO.trim());
    }

    public void setWsPhoneNoH(String wsPhoneNoH) {
        this.wsPhoneNoH = String.format("%-16s", wsPhoneNoH.trim());
    }

    public void setWsEngName(String wsEngName) {
        this.wsEngName = String.format("%-50s", wsEngName);
    }

    public void setWsAddr(String wsAddr) {
        this.wsAddr = String.format("%-50s", wsAddr);
    }

    public void setWsOperUser(int wsOperUser) {
        this.wsOperUser = wsOperUser;
    }

    public void setWsOperDate(int wsOperDate) {
        this.wsOperDate = wsOperDate;
    }

    public FUR211() {
        this.wsBrokerId = "F905000";
        this.wsIbNo = "P00";
        this.wsIntroduceId = "           ";
        this.wsName = "                    ";
        this.wsIdNo = "           ";
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        Date now = new Date();
        this.wsDate = Integer.parseInt(sdfDate.format(now));
        this.wsPhoneNoO = "                ";
        this.wsPhoneNoH = "                ";
        this.wsEngName = "                                                  ";
        this.wsAddr = "                                                  ";
        this.wsOperUser = 1001;
        this.wsOperDate = this.wsDate;
    }

    public void setValue(byte[] sendData, int offset) {
        byte[] tempBytes = new byte[7];
        int startPos = offset;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsBrokerId.length());
        setWsBrokerId(new String(tempBytes));

        tempBytes = new byte[3];
        startPos += 7;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsIbNo.length());
        setWsIbNo(new String(tempBytes));

        tempBytes = new byte[11];
        startPos += 3;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsIntroduceId.length());
        setWsIntroduceId(new String(tempBytes));

        tempBytes = new byte[20];
        startPos += 11;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsName.length());
        setWsName(new String(tempBytes));

        tempBytes = new byte[11];
        startPos += wsName.length();
        System.arraycopy(sendData, startPos, tempBytes, 0, wsIdNo.length());
        setWsIdNo(new String(tempBytes));

        tempBytes = new byte[4];
        startPos += 11;
        System.arraycopy(sendData, startPos, tempBytes, 0, 4);
        ByteBuffer wrapped = ByteBuffer.wrap(tempBytes);
        setWsDate(wrapped.getInt());

        tempBytes = new byte[16];
        startPos += 4;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsPhoneNoO.length());
        setWsPhoneNoO(new String(tempBytes));

        startPos += 16;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsPhoneNoH.length());
        setWsPhoneNoH(new String(tempBytes));

        tempBytes = new byte[50];
        startPos += 16;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsEngName.length());
        setWsEngName(new String(tempBytes));

        startPos += 50;
        System.arraycopy(sendData, startPos, tempBytes, 0, wsAddr.length());
        setWsAddr(new String(tempBytes));

        tempBytes = new byte[4];
        startPos += 50;
        System.arraycopy(sendData, startPos, tempBytes, 0, 4);
        wrapped = ByteBuffer.wrap(tempBytes);
        setWsOperUser(wrapped.getInt());

        startPos += 4;
        System.arraycopy(sendData, startPos, tempBytes, 0, 4);
        wrapped = ByteBuffer.wrap(tempBytes);
        setWsOperDate(wrapped.getInt());
    }

    public byte[] getBytes() {
        List<Byte> bytes = new ArrayList<>();
        ByteBuffer buffer;

        bytes.addAll(Bytes.asList(wsBrokerId.getBytes()));
        bytes.addAll(Bytes.asList(wsIbNo.getBytes()));
        bytes.addAll(Bytes.asList(wsIntroduceId.getBytes()));
        bytes.addAll(Bytes.asList(wsName.getBytes()));
        bytes.addAll(Bytes.asList(wsIdNo.getBytes()));
        buffer = ByteBuffer.allocate(4);
        buffer.putInt(wsDate).flip();
        bytes.addAll(Bytes.asList(buffer.array()));
        bytes.addAll(Bytes.asList(wsPhoneNoO.getBytes()));
        bytes.addAll(Bytes.asList(wsPhoneNoH.getBytes()));
        bytes.addAll(Bytes.asList(wsEngName.getBytes()));
        bytes.addAll(Bytes.asList(wsAddr.getBytes()));
        buffer = ByteBuffer.allocate(4);
        buffer.putInt(wsOperUser).flip();
        bytes.addAll(Bytes.asList(buffer.array()));
        buffer = ByteBuffer.allocate(4);
        buffer.putInt(wsOperDate).flip();
        bytes.addAll(Bytes.asList(buffer.array()));

        return Bytes.toArray(bytes);
    }
}
