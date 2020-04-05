package src.com.yujili.learn.pattern.adaptor;

public class DvdPlayer implements AdvanceMediaPlayer {
    @Override
    public String playDvd(String mediaName) {
        return String.format("Dvd: %s", mediaName);
    }

    @Override
    public String playMp4(String mediaName) {
        return null;
    }
}
