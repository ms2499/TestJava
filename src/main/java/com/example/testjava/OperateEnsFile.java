package com.example.testjava;

import com.tandem.ext.enscribe.EnscribeFile;
import com.tandem.ext.enscribe.EnscribeFileException;
import com.tandem.ext.enscribe.EnscribeKeyPositionOptions;
import com.tandem.ext.enscribe.EnscribeOpenOptions;
import com.tandem.ext.guardian.GError;
import com.tandem.ext.guardian.GuardianException;

import java.math.BigDecimal;

public class OperateEnsFile {
    public void runOper(){
        try {
            CharsetTool cstool = new CharsetTool();
            EnscribeFile fumcom = new EnscribeFile("/G/FU1/SAMOSS/FUMCOM"); //指定檔案路徑 $FU1.SAMOSS.FUMCOM
            //設定open file方式
            EnscribeOpenOptions openAttr = new EnscribeOpenOptions();
            openAttr.setAccess(EnscribeOpenOptions.READ_WRITE);
            openAttr.setExclusion(EnscribeOpenOptions.SHARED);
            fumcom.open(openAttr);
            System.out.println(cstool.big52iso("開檔成功! File:") + fumcom.getFileName());

            System.out.println("------------------------------------------------------------");

            //設定key及查詢方式
//            EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();
//            String keyvalue;
//            kpa.setKeySpecifier((short) 0); //0表示P Key
//            keyvalue = cstool.big52iso("F000000CAA    ");
//            kpa.setKeyValue(keyvalue);
//            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_GENERIC);
//            kpa.setKeyLength((short)14);
//            kpa.setCompareLength(10);
//            fumcom.keyPosition(kpa);

            //讀檔並將讀出來的資料放入IO_Fumcom_r
            //IO_Fumcom_r 此物件由ddl2java產出
            IO_Fumcom_r fumcomR = new IO_Fumcom_r();
            int countRead = 0;
            System.out.println(cstool.big52iso("開始讀檔 "));
            do{
                countRead = fumcom.read(fumcomR);
                if (countRead != -1) // -1 = EOF
                    System.out.println(fumcomR.getCom_commodity_id() + " " +
                            fumcomR.getCom_name() + " " +
                            fumcomR.getCom_min_fluct());
            }while (countRead != -1);
            System.out.println(cstool.big52iso("讀檔完畢!"));

            System.out.println("------------------------------------------------------------");

            //新增一筆資料
            System.out.println(cstool.big52iso("開始新增資料"));
            fumcomR = new IO_Fumcom_r();
            EnscribeKeyPositionOptions kpa = new EnscribeKeyPositionOptions();
            String keyvalue;
            kpa.setKeySpecifier((short) 0); //0表示P Key
            keyvalue = cstool.big52iso("F000000CAA    ");
            kpa.setKeyValue(keyvalue);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_GENERIC);
            kpa.setKeyLength((short)14);
            kpa.setCompareLength(14);
            fumcom.keyPosition(kpa);
            fumcom.read(fumcomR);
            fumcomR.setCom_commodity_id(cstool.big52iso("CAA   T"));
            fumcomR.setCom_min_fluct(BigDecimal.valueOf(3000.12));
            try {
                fumcom.write(fumcomR);

                //新增完重新查詢，確定非殘留資料
                fumcomR = new IO_Fumcom_r();
                keyvalue = cstool.big52iso("F000000CAA   T");
                kpa.setKeyValue(keyvalue);
                kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
                kpa.setKeyLength((short)14);
                kpa.setCompareLength(14);
                fumcom.keyPosition(kpa);
                countRead = fumcom.read(fumcomR);
                if (countRead == -1)
                    throw new EnscribeFileException(cstool.big52iso("查無資料!"), (short) GError.EEOF,
                            cstool.big52iso("insert"), fumcom.getFileName());
                System.out.println(cstool.big52iso("新增一筆:") +
                        fumcomR.getCom_commodity_id() + " " +
                        fumcomR.getCom_name() + " " +
                        fumcomR.getCom_min_fluct());
            }catch (EnscribeFileException ef){
                System.out.println("Guardian error = " + ef.getErrorNum());
                if (ef.getErrorNum() == GError.EBADERR) //Guardian error 10
                    System.out.println(cstool.big52iso("此筆已存在:") +
                            fumcomR.getCom_commodity_id() + " " +
                            fumcomR.getCom_name() + " " +
                            fumcomR.getCom_min_fluct());
            }

            System.out.println("------------------------------------------------------------");

            System.out.println(cstool.big52iso("開始更新資料"));
            fumcomR = new IO_Fumcom_r();
            keyvalue = cstool.big52iso("F000000CAA   T");
            kpa.setKeyValue(keyvalue);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
            kpa.setKeyLength((short)14);
            kpa.setCompareLength(14);
            fumcom.keyPosition(kpa);
            fumcom.readLock(fumcomR);
            System.out.println(cstool.big52iso("舊資料:") +
                    fumcomR.getCom_commodity_id() + " " +
                    fumcomR.getCom_name() + " " +
                    fumcomR.getCom_min_fluct());
            fumcomR.setCom_min_fluct(BigDecimal.valueOf(4321.97));
            fumcomR.setCom_name(cstool.big52iso("南亞塑膠工業選擇權測試        "));
            try {
                fumcom.writeUpdateUnlock(fumcomR);

                //更新完重新查詢，確定非殘留資料
                fumcomR = new IO_Fumcom_r();
                keyvalue = cstool.big52iso("F000000CAA   T");
                kpa.setKeyValue(keyvalue);
                kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
                kpa.setKeyLength((short)14);
                kpa.setCompareLength(14);
                fumcom.keyPosition(kpa);
                countRead = fumcom.read(fumcomR);
                if (countRead == -1)
                    throw new EnscribeFileException(cstool.big52iso("查無資料!"), (short) GError.EEOF,
                            cstool.big52iso("insert"), fumcom.getFileName());
                System.out.println(cstool.big52iso("新資料:") +
                        fumcomR.getCom_commodity_id() + " " +
                        fumcomR.getCom_name() + " " +
                        fumcomR.getCom_min_fluct());
            }catch (EnscribeFileException ef){
                System.out.println("Guardian error = " + ef.getErrorNum());
            }

            System.out.println("------------------------------------------------------------");

            System.out.println(cstool.big52iso("開始刪除資料"));
            fumcomR = new IO_Fumcom_r();
            keyvalue = cstool.big52iso("F000000CAA   T");
            kpa.setKeyValue(keyvalue);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
            kpa.setKeyLength((short)14);
            kpa.setCompareLength(14);
            fumcom.keyPosition(kpa);
            fumcom.readLock(fumcomR);
            try {
                fumcom.deleteRecordUnlock();
                System.out.println(cstool.big52iso("刪除資料:") +
                        fumcomR.getCom_commodity_id() + " " +
                        fumcomR.getCom_name() + " " +
                        fumcomR.getCom_min_fluct());
            }catch (EnscribeFileException ef){
                System.out.println("Guardian error = " + ef.getErrorNum());
            }

            System.out.print(cstool.big52iso("重新讀取，確認已刪除 => "));
            keyvalue = cstool.big52iso("F000000CAA   T");
            kpa.setKeyValue(keyvalue);
            kpa.setPositioningMode(EnscribeKeyPositionOptions.POSITION_EXACT);
            kpa.setKeyLength((short)14);
            kpa.setCompareLength(14);
            fumcom.keyPosition(kpa);
            try {
                countRead = fumcom.read(fumcomR);
                if (countRead == -1)
                    System.out.println(cstool.big52iso("查無此筆資料! PKey=[") + keyvalue + "]");
            }catch (EnscribeFileException ef){
                System.out.println("Guardian error = " + ef.getErrorNum());
            }

        }catch (GuardianException ge){
            System.out.println("Guardian error = " + ge.getErrorNum());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
