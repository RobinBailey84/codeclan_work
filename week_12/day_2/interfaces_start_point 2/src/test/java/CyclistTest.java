import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CyclistTest {

    Cyclist cyclist;

    @Before
    public void before() {

        cyclist = new Cyclist();
    }

    @Test
    public void hasDistanceAtBeginning() {

        assertEquals(0, cyclist.getDistanceTravelled());
    }

    @Test
    public void canCycyle() {
        cyclist.cycle(10);
        assertEquals(10, cyclist.getDistanceTravelled());
    }
}
