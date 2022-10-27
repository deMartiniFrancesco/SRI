package demartini_F_Orario_01.bin.packages;

import demartini_F_Orario_01.bin.PacketOperationCode;

import java.util.Arrays;

public abstract class MTPPacket {

    protected final PacketOperationCode operationCode;
    protected byte[] bytePacket;

    public MTPPacket(PacketOperationCode packetOperationCode) {
        this.operationCode = packetOperationCode;
    }

    public MTPPacket(byte[] bytePacket) {
        this.bytePacket = bytePacket;
        operationCode = PacketOperationCode.findByValue(bytePacket[0]);
    }

    public PacketOperationCode getOperationCode() {
        return operationCode;
    }

    public byte[] getBytePacket() {
        return bytePacket;
    }

    @Override
    public String toString() {
        return "MTSPacket{" +
                "packetType=" + operationCode +
                ", bytePacket=" + Arrays.toString(bytePacket) +
                '}';
    }
}