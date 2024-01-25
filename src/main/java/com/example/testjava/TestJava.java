package com.example.testjava;

import com.tandem.tsmp.TsmpServer;

import java.nio.charset.StandardCharsets;

public class TestJava {
    public static void main(String[] args){
        CharsetTool cstool = new CharsetTool();
        String pmonName = "$YTPW";
        String svrClassName = "FUS101";
        TsmpServer getServer = new TsmpServer(pmonName, svrClassName);
        byte[] greply = new byte[4096];
        IpmHeader ipm = new IpmHeader();
        FUS101 fus101 = new FUS101();
        byte[] ipmHeader = ipm.getBytes();
        byte[] fus101Send = fus101.getSendData();
        byte[] request = new byte[ipmHeader.length + fus101Send.length];
        System.arraycopy(ipmHeader, 0, request, 0, ipmHeader.length);
        System.arraycopy(fus101Send, 0, request, ipmHeader.length, fus101Send.length);
        try {
            getServer.service(request, request.length, greply);
        }catch (Exception e){
            e.printStackTrace();
        }
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
