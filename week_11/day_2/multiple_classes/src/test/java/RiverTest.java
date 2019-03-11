import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RiverTest {
    River river;
    Salmon salmon;

    @Before
    public void setUp() {
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void startsOffEmpty() {
        assertEquals(0, river.fishCount());
    }

    @Test
    public void canAddFish() {
        river.addFish(salmon);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void canRemoveFish() {
        river.addFish(salmon);
        river.removeFish();
        assertEquals(0, river.fishCount());
    }
}
