package cn.nukkit.network.protocol;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class ShowProfilePacket extends DataPacket {
    public static final int NETWORK_ID = ProtocolInfo.SHOW_PROFILE_PACKET;

    public String xuid;

    @Override
    public int pid() {
        return NETWORK_ID;
    }

    @Override
    public void decode() {
        this.xuid = this.getString();
    }

    @Override
    public void encode() {
        this.reset();
        this.putString(this.xuid);
    }

}
