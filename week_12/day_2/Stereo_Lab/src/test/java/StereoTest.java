import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StereoTest {
    CDPlayer cdPlayer;
    Radio radio;
    Stereo stereo;

    @Before
    public void beofore(){
        cdPlayer = new CDPlayer("Sony", "CD5", 5);
        radio = new Radio("Panasonic", "R2");
        stereo = new Stereo("Steza");
    }

    @Test
    public void stereoHasName() {
        assertEquals("Steza", stereo.getName());
    }

    @Test
    public void stereoHasEmptyArray() {
        assertEquals(0, stereo.countCompenents());
    }

    @Test
    public void canAddComponents() {
        stereo.addComponent(radio);
        assertEquals(1, stereo.countCompenents());
    }

    @Test
    public void stereoCanPlayCD() {
        stereo.addComponent(cdPlayer);
        stereo.addComponent(radio);
        assertEquals("CD Playing", cdPlayer.play());
    }

    @Test
    public void canTuneRadio() {
        stereo.addComponent(radio);
        assertEquals("Playing Radio 2", radio.tuneRadio("Radio 2"));
    }

    @Test
    public void stereoCanConnect() {
        assertEquals("Steza is connected.", stereo.connect(stereo));
    }

    @Test
    public void canChangeVolume() {
        assertEquals("Volume: 20", stereo.changeVolume(20));
    }
}
