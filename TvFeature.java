class MyTvInfo {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume) {

        // Validate parameter
        if (volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;

        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {

        // Validate parameter
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        // Save current channel by previous channel 
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}

public class TvFeature {
    public static void main(String[] args) {
        MyTvInfo t = new MyTvInfo();

        t.setVolume(20);
        System.out.println("CH:" + t.getVolume());

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());

        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());

    }
}
