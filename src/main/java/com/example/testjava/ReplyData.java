package com.example.testjava;

import com.google.common.primitives.Bytes;
import lombok.Data;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class ReplyData {
    public short replyCode = 0;
    public String replyMsg;

    public void setReplyMsg(String replyMsg) {
        byte[] bytes = new byte[78];
        Arrays.fill(bytes, (byte) ' ');
        System.arraycopy(replyMsg.getBytes(), 0, bytes, 0, replyMsg.getBytes().length);
        this.replyMsg = new String(bytes);
    }

    public ReplyData() {
        this.replyCode = 0;
        this.replyMsg = String.format("%-78s", " ");
    }

    public byte[] getBytes() {
        List<Byte> bytes = new ArrayList<>();

        ByteBuffer buffer = ByteBuffer.allocate(2);
        buffer.putShort(this.replyCode).flip();
        bytes.addAll(Bytes.asList(buffer.array()));

        byte[] tmpBytes = new byte[78];
        Arrays.fill(tmpBytes, (byte) ' ');
        System.arraycopy(replyMsg.getBytes(), 0, tmpBytes, 0, replyMsg.getBytes().length);
        bytes.addAll(Bytes.asList(tmpBytes));

        return Bytes.toArray(bytes);
    }
}
