package com.example.testjava;

import com.tandem.tsmp.TsmpServer;

import java.nio.charset.StandardCharsets;

public class Jpathsend {
    public void PathsendSample(){
        CharsetTool cstool = new CharsetTool(); //轉編碼用
        String pmonName = "$YTPW"; //pathmon name
        String svrClassName = "FUS101"; //server class name
        TsmpServer getServer = new TsmpServer(pmonName, svrClassName); //pathsend用物件
        byte[] greply = new byte[4096]; //pathsend完放資料的array
        IpmHeader ipm = new IpmHeader(); //COBOL那邊定義的IPM-HEADER格式
        FUS101 fus101 = new FUS101(); //FUS101的MESSAGE-IN-R格式
        byte[] ipmHeader = ipm.getBytes();
        byte[] fus101Send = fus101.getSendData();
        byte[] request = new byte[ipmHeader.length + fus101Send.length];
        System.arraycopy(ipmHeader, 0, request, 0, ipmHeader.length);
        System.arraycopy(fus101Send, 0, request, ipmHeader.length, fus101Send.length);
        try {
            getServer.service(request, request.length, greply); //pathsend
        }catch (Exception e){
            e.printStackTrace();
        }

        //處理pathsend回來的資料
        byte[][] wrShareData = new byte[12][64];
        byte[][] wrFeeKind = new byte[12][14];
        int startpos = 2 + 78 + 14 + 14;
        int feepos = startpos + 62 * 12;
        System.out.println(cstool.big52iso(" 商品   中文名稱  最小跳   升降      契約      交易               特定分類   "));
        System.out.println(cstool.big52iso(" 代號             動單價   單位      價值      稅率   證券代號  上   投   下 "));
        System.out.println(cstool.big52iso("------- -------- -------- ------ ---------- --------- -------- ---- ---- ----"));
        for (int i = 0; i < 12; i++){
            System.arraycopy(greply, startpos + 62*i, wrShareData[i], 0, 62);
            System.arraycopy(greply, feepos + 14*i, wrFeeKind[i], 0, 14);
            System.out.println(new String(wrShareData[i], StandardCharsets.ISO_8859_1) + " " +
                    new String(wrFeeKind[i], StandardCharsets.ISO_8859_1));
        }
        byte[] wrAdvisory = new byte[78];
        System.arraycopy(greply, 2, wrAdvisory, 0, 78);
        System.out.println(new String(wrAdvisory, StandardCharsets.ISO_8859_1));
    }
}
