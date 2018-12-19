package cn.nukkit.network.protocol;

/**
 * Created on 15-10-13.
 */
public class PlayStatusPacket extends DataPacket {

    public static final int NETWORK_ID = ProtocolInfo.PLAY_STATUS_PACKET;

    @Override
    public int pid() {
        return NETWORK_ID;
    }

    public static final int LOGIN_SUCCESS = 0;
    public static final int LOGIN_FAILED_CLIENT = 1;
    public static final int LOGIN_FAILED_SERVER = 2;
    public static final int PLAYER_SPAWN = 3;
    public static final int LOGIN_FAILED_INVALID_TENANT = 4;
    public static final int LOGIN_FAILED_VANILLA_EDU = 5;
    public static final int LOGIN_FAILED_EDU_VANILLA = 6;

    public int status;

    @Override
    public void decode() {

    }

    @Override
    public void encode() {
        this.reset();
        this.putInt(this.status);
    }

}
