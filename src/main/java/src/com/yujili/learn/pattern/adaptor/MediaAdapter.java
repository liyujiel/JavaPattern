package src.com.yujili.learn.pattern.adaptor;

public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("dvd")) {
            advanceMediaPlayer = new DvdPlayer();
        }

        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public String play(String audioType, String mediaName) {
        if (audioType.equalsIgnoreCase("dvd")) {
            return advanceMediaPlayer.playDvd(mediaName);
        }

        if (audioType.equalsIgnoreCase("mp4")) {
            return advanceMediaPlayer.playMp4(mediaName);
        }

        return "";
    }
}
