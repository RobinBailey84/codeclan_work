import Engines.ElectricEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {
    ElectricEngine electricEngine;

    @Before
    public void setUp() throws Exception {
        electricEngine = new ElectricEngine(150);
    }

    @Test
    public void repairCostStarts0() {
        assertEquals(0, electricEngine.getRepairCost());
    }

    @Test
    public void worthRepairStartsTrue() {
        assertEquals(true, electricEngine.worthRepair());
    }

    @Test
    public void canCrash() {
        assertEquals(0, electricEngine.getRepairCost());
        electricEngine.crash(1);
        assertEquals(250, electricEngine.getRepairCost());
    }

    @Test
    public void canRepair() {
        assertEquals(0, electricEngine.getRepairCost());
        electricEngine.crash(2);
        assertEquals(1000, electricEngine.getRepairCost());
        electricEngine.repair();
        assertEquals(0, electricEngine.getRepairCost());
    }
}
