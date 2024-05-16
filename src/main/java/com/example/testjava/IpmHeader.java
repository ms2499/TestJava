package com.example.testjava;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import com.google.common.primitives.Bytes;
import lombok.Data;

@Data
public class IpmHeader {
    CharsetTool cstool = new CharsetTool();
    public short replyCode;
    public short transCode;
    public short functionCode;
    public String termId;
    public String brokerId;
    public String ibNo;
    public String brokerName;
    public String telNo;
    public int toDay;
    public char _2sysFlag;
    public String _2sysBroker;
    public String _2sysIbNo;
    public char dataProtect;

    public void setReplyCode(short replyCode) {
        this.replyCode = replyCode;
    }

    public void setTransCode(short transCode) {
        this.transCode = transCode;
    }

    public void setFunctionCode(short functionCode) {
        this.functionCode = functionCode;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public void setIbNo(String ibNo) {
        this.ibNo = ibNo;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void setToDay(int toDay) {
        this.toDay = toDay;
    }

    public void set_2sysFlag(char _2sysFlag) {
        this._2sysFlag = _2sysFlag;
    }

    public void set_2sysBroker(String _2sysBroker) {
        this._2sysBroker = _2sysBroker;
    }

    public void set_2sysIbNo(String _2sysIbNo) {
        this._2sysIbNo = _2sysIbNo;
    }

    public void setDataProtect(char dataProtect) {
        this.dataProtect = dataProtect;
    }

    public IpmHeader(){
        replyCode = 0;
        transCode = 1;
        functionCode = 1;
        termId = "252-ZTN0國內";
        brokerId = "F905000";
        ibNo = "P00";
        brokerName = "總公司    ";
        telNo = "1001        ";
        toDay = 20240119;
        _2sysFlag = ' ';
        _2sysBroker = "F905000";
        _2sysIbNo = "P00";
        dataProtect = ' ';
    }

    public byte[] getBytes(){
        List<Byte> bytes = new ArrayList<>();
        ByteBuffer buffer;

        buffer = ByteBuffer.allocate(2);
        buffer.putShort(replyCode).flip();
        bytes.addAll(Bytes.asList(buffer.array()));
        buffer = ByteBuffer.allocate(2);
        buffer.putShort(transCode).flip();
        bytes.addAll(Bytes.asList(buffer.array()));
        buffer = ByteBuffer.allocate(2);
        buffer.putShort(functionCode).flip();
        bytes.addAll(Bytes.asList(buffer.array()));
        bytes.addAll(Bytes.asList(cstool.big52iso(termId).getBytes()));
        bytes.addAll(Bytes.asList(brokerId.getBytes()));
        bytes.addAll(Bytes.asList(ibNo.getBytes()));
        bytes.addAll(Bytes.asList(cstool.big52iso(brokerName).getBytes()));
        bytes.addAll(Bytes.asList(telNo.getBytes()));
        buffer = ByteBuffer.allocate(4);
        buffer.putInt(toDay).flip();
        bytes.addAll(Bytes.asList(buffer.array()));
        bytes.add((byte)_2sysFlag);
        bytes.addAll(Bytes.asList(_2sysBroker.getBytes()));
        bytes.addAll(Bytes.asList(_2sysIbNo.getBytes()));
        bytes.add((byte)dataProtect);

        return Bytes.toArray(bytes);
    }

    public void setValue(byte[] sendData) {
        byte[] tempBytes = new byte[2];
        int startPos = 0;
        System.arraycopy(sendData, startPos, tempBytes, 0, 2);
        ByteBuffer wrapped = ByteBuffer.wrap(tempBytes);
        setReplyCode(wrapped.getShort());

        startPos += 2;
        System.arraycopy(sendData, startPos, tempBytes, 0, 2);
        wrapped = ByteBuffer.wrap(tempBytes);
        setTransCode(wrapped.getShort());

        startPos += 2;
        System.arraycopy(sendData, startPos, tempBytes, 0, 2);
        wrapped = ByteBuffer.wrap(tempBytes);
        setFunctionCode(wrapped.getShort());

        tempBytes = new byte[12];
        startPos += 2;
        System.arraycopy(sendData, startPos, tempBytes, 0, 12);
        setTermId(new String(tempBytes));

        tempBytes = new byte[7];
        startPos += 12;
        System.arraycopy(sendData, startPos, tempBytes, 0, 7);
        setBrokerId(new String(tempBytes));

        tempBytes = new byte[3];
        startPos += 7;
        System.arraycopy(sendData, startPos, tempBytes, 0, 3);
        setIbNo(new String(tempBytes));

        tempBytes = new byte[10];
        startPos += 3;
        System.arraycopy(sendData, startPos, tempBytes, 0, 10);
        setBrokerName(new String(tempBytes));

        tempBytes = new byte[12];
        startPos += 10;
        System.arraycopy(sendData, startPos, tempBytes, 0, 12);
        setTelNo(new String(tempBytes));

        tempBytes = new byte[4];
        startPos += 12;
        System.arraycopy(sendData, startPos, tempBytes, 0, 4);
        wrapped = ByteBuffer.wrap(tempBytes);
        setToDay(wrapped.getInt());

        startPos += 4;
        set_2sysFlag((char) sendData[startPos]);

        tempBytes = new byte[7];
        startPos += 1;
        System.arraycopy(sendData, startPos, tempBytes, 0, 7);
        set_2sysBroker(new String(tempBytes));

        tempBytes = new byte[3];
        startPos += 7;
        System.arraycopy(sendData, startPos, tempBytes, 0, 3);
        set_2sysIbNo(new String(tempBytes));

        startPos += 3;
        setDataProtect((char) sendData[startPos]);
    }
}
