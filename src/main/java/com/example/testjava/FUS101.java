package com.example.testjava;

import com.google.common.primitives.Bytes;

import java.util.ArrayList;
import java.util.List;

public class FUS101 {
    public String wsExchId;
    public String wsCommodityId;
    public char wsRange;
    public String wsFeeKind;
    public String wsUpFeeKind;
    public String wsDnFeeKind;
    public String wsStockNo;
    public char wsProdKing;
    public String wsSpoolNoIb;
    public char wsSpoolNo4;
    public String wsKey;
    public String wsCopies;

    public FUS101(){
        wsExchId = "F000000";
        wsCommodityId = "       ";
        wsRange = ' ';
        wsFeeKind = "       ";
        wsUpFeeKind = "       ";
        wsDnFeeKind = "       ";
        wsStockNo = "       ";
        wsProdKing = ' ';
        wsSpoolNoIb = "P00";
        wsSpoolNo4 = '2';
        wsKey = "              ";
        wsCopies = "01";
    }

    public byte[] getSendData(){
        List<Byte> bytes = new ArrayList<>();

        bytes.addAll(Bytes.asList(wsExchId.getBytes()));
        bytes.addAll(Bytes.asList(wsCommodityId.getBytes()));
        bytes.add((byte) wsRange);
        bytes.addAll(Bytes.asList(wsFeeKind.getBytes()));
        bytes.addAll(Bytes.asList(wsUpFeeKind.getBytes()));
        bytes.addAll(Bytes.asList(wsDnFeeKind.getBytes()));
        bytes.addAll(Bytes.asList(wsStockNo.getBytes()));
        bytes.add((byte) wsProdKing);
        bytes.addAll(Bytes.asList(wsSpoolNoIb.getBytes()));
        bytes.add((byte) wsSpoolNo4);
        bytes.addAll(Bytes.asList(wsKey.getBytes()));
        bytes.addAll(Bytes.asList(wsCopies.getBytes()));

        return Bytes.toArray(bytes);
    }
}
