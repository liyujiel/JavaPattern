package src.com.yujili.learn.pattern.adaptor;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public String play(String audioType, String mediaName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            return mediaName;
        }
        else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("dvd")) {
            mediaAdapter = new MediaAdapter(audioType);
            return mediaAdapter.play(audioType, mediaName);
        }
        else {
            return "";
        }
    }
}
