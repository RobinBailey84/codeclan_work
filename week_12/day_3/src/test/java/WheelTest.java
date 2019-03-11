import Components.Wheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelTest {
    Wheel wheel;

    @Before
    public void setUp() throws Exception {
        wheel = new Wheel();
    }

    @Test
    public void repairCostStarts0() {
        assertEquals(0, wheel.getRepairCost());
    }

    @Test
    public void worthRepairStartsTrue() {
        assertEquals(true, wheel.worthRepair());
    }

    @Test
    public void canCrash() {
        assertEquals(0, wheel.getRepairCost());
        wheel.crash(1);
        assertEquals(50, wheel.getRepairCost());
    }

    @Test
    public void canRepair() {
        assertEquals(0, wheel.getRepairCost());
        wheel.crash(2);
        assertEquals(200, wheel.getRepairCost());
        wheel.repair();
        assertEquals(0, wheel.getRepairCost());
    }
}
