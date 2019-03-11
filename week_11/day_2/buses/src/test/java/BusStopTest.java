import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Queen St");
        person = new Person();
    }

    @Test
    public void countPeopleAtBusStop(){
        assertEquals(0, busStop.countQueue());
    }

    @Test
    public void addPersonToBusStopQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void removePersonFromBusStopQueue(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.countQueue());
    }
}
