public class RemoteImp implements Remote {

    int channel, volume = 0;

    public void volumeUp() {
        volume ++;
        System.out.println("Volume up " + volume);
    }
    public void volumeDown() {
        volume --;
        System.out.println("Volume down " + volume);
    }
    public void channelUp() {
        channel ++;
        System.out.println("Channel up " + channel);
    }
    public void channelDown() {
        channel --;
        System.out.println("Channel down " + channel);
    }
}
