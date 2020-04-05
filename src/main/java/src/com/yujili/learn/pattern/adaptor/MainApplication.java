package src.com.yujili.learn.pattern.adaptor;

public class MainApplication {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        System.out.println(audioPlayer.play("mp3", "test"));
        System.out.println(audioPlayer.play("mp4", "test"));
        System.out.println(audioPlayer.play("dvd", "test"));
        System.out.println(audioPlayer.play("avi", "test"));
    }
}
