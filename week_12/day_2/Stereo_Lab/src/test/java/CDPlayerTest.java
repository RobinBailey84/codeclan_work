import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Panasonic", "CD1", 5);
    }

    @Test
    public void hasCDS() {
        assertEquals(5, cdPlayer.getCdsHeld());
    }

    @Test
    public void canPlay() {
        assertEquals("CD Playing", cdPlayer.play());
    }
}
