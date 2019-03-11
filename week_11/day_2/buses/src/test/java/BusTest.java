import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 10);
        person = new Person();
        busStop = new BusStop("Queen St");
        busStop.addPerson(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkBusHasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void checkBusesCapacity(){
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void checkPassengerCanBeAdded(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkPassengersIsRemoved(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkBusCanPickUpFromBusStop(){
        bus.pickupPassenger(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.countQueue()    );
    }



}
