import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room doubleBedroom;
    Guest guest;
    Room diningRoom;


    @Before
    public void before(){
        hotel = new Hotel();
        doubleBedroom = new Room(1, 2, "Double Bedroom", 95);
        guest = new Guest();
        diningRoom = new Room(2, 10,"Dining Room", 129);
    }

    @Test
    public void canAddBedoom() {
        hotel.addBedroomToHotel(doubleBedroom);
        assertEquals(1, hotel.getBedroom());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addDiningRoomToHotel(doubleBedroom);
        assertEquals(1, hotel.getDiningRoom());
    }

    @Test
    public void canAddMeetingRoom() {
        hotel.addMeetingRoomToHotel(doubleBedroom);
        assertEquals(1, hotel.getMeetingRoom());
    }

    @Test
    public void canAddGuestToRoom() {
        hotel.addGuestToRoom(doubleBedroom, guest);
        assertEquals(1, doubleBedroom.guestCount());
        hotel.addGuestToRoom(diningRoom, guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        hotel.addGuestToRoom(doubleBedroom, guest);
        hotel.addGuestToRoom(doubleBedroom, guest);
        hotel.removeGuestFromRoom(doubleBedroom);
        assertEquals(1, doubleBedroom.guestCount());
    }

    @Test
    public void canFindRoomByType() {
        hotel.addBedroomToHotel(doubleBedroom);
        hotel.addBedroomToHotel(doubleBedroom);
        ArrayList<Room> foundRooms = hotel.findByRoomType("Double Bedroom");
        assertEquals(2, foundRooms.size());
    }

    @Test
    public void canCreateBooking() {
        hotel.addBedroomToHotel(doubleBedroom);
        hotel.bookRoom(doubleBedroom, 7);
        assertEquals(1, hotel.numberOfBookings());
    }
}
