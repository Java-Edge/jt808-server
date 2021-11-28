package org.yzh.protocol.t808;

import io.github.yezhihao.protostar.DataType;
import io.github.yezhihao.protostar.annotation.Field;
import io.github.yezhihao.protostar.annotation.Message;
import org.yzh.protocol.basics.JTMessage;
import org.yzh.protocol.commons.JT808;

/**
 * @author yezhihao
 * @home https://gitee.com/yezhihao/jt808-server
 */
@Message(JT808.数据压缩上报)
public class T0901 extends JTMessage {

    @Field(index = 0, type = DataType.DWORD, desc = "压缩消息长度")
    private int length;
    @Field(index = 4, type = DataType.BYTES, desc = "压缩消息体")
    private byte[] body;

    public T0901() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
        this.length = body.length;
    }
}