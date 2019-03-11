import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {

    Booking booking;
    Room room;

    @Before
    public void before(){
        room = new Room(1, 2,"Bedroom", 66);
        booking = new Booking(7, room);
    }

    @Test
    public void nightsBooked() {
        assertEquals(7, booking.nightsBooked());
    }

    @Test
    public void checkTotalBill() {
        assertEquals(462.0, booking.totalBill());
    }
}
