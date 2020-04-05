package src.com.yujili.learn.pattern.adaptor;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public String playDvd(String mediaName) {
        return null;
    }

    @Override
    public String playMp4(String mediaName) {
        return String.format("Mp4: %s", mediaName);
    }
}
