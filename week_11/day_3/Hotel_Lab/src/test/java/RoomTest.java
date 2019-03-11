import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before(){
        room = new Room(1, 2,"Bedroom",95);
        guest = new Guest();

    }

    @Test
    public void checkRoomHasNumber() {
        assertEquals(1, room.getRoomNumber());
    }

    @Test
    public void canAddGuestToRoom(){
        room.addGuest(guest);
        assertEquals(1, room.guestCount());
    }

    @Test

    public void canRemoveGuest() {
        room.addGuest(guest);
        room.addGuest(guest);
        room.removeGuest();
        assertEquals(1, room.guestCount());
    }
}
