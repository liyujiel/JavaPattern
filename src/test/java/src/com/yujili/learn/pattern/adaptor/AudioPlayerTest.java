package src.com.yujili.learn.pattern.adaptor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AudioPlayerTest {
    private AudioPlayer audioPlayer;
    private static final String fileName = "test";

    @Before
    public void before() {
        audioPlayer = new AudioPlayer();
    }

    @Test
    public void testPlayDvd() {
        // When
        String dvd = audioPlayer.play("Dvd", fileName);

        // Then
        Assert.assertEquals(dvd, "Dvd: test");
    }

    @Test
    public void testPlayMp4() {
        // When
        String mp4 = audioPlayer.play("Mp4", fileName);

        // Then
        Assert.assertEquals(mp4, "Mp4: test");
    }

    @Test
    public void testPlayMp3() {
        // When
        String mp3 = audioPlayer.play("Mp3", fileName);

        // Then
        Assert.assertEquals(mp3, "test");
    }

    @Test
    public void testPlayUnknownMediaType() {
        // When
        String avi = audioPlayer.play("Avi", fileName);

        // Then
        Assert.assertEquals(avi, "");
    }
}
