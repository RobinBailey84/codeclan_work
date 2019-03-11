import Engines.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import Cars.PetrolCar;

public class PetrolCarTest {
    PetrolCar petrolCar;

    @Before
    public void setUp() throws Exception {
        petrolCar = new PetrolCar(new PetrolEngine(500), 4000);
    }

    @Test
    public void repairCostStarts0() {
        assertEquals(0, petrolCar.getRepairCost());
    }

    @Test
    public void worthRepairStartsTrue() {
        assertEquals(true, petrolCar.worthRepair());
    }

    @Test
    public void canCrash() {
        assertEquals(0, petrolCar.getRepairCost());
        petrolCar.getWheels().get(0).crash(2);
        assertEquals(200, petrolCar.getRepairCost());
    }

    @Test
    public void canRepair() {
        assertEquals(0, petrolCar.getRepairCost());
        petrolCar.getWheels().get(0).crash(2);
        assertEquals(200, petrolCar.getRepairCost());
        petrolCar.repair();
        assertEquals(0, petrolCar.getRepairCost());
    }

    @Test
    public void canVroom() {
        assertEquals("Vroom.", petrolCar.vroom());
    }
}
