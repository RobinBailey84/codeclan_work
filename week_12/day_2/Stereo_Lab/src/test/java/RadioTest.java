import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "S30");
    }

    @Test
    public void radioHasMAke() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void radioHasModel() {
        assertEquals("S30", radio.getModel());
    }

    @Test
    public void canTune() {
        assertEquals("Playing Radio 1", radio.tuneRadio("Radio 1"));
    }
}
