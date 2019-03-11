import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> bedroom;
    private ArrayList<Room> meetingRoom;
    private ArrayList<Room> diningRoom;
    private ArrayList<Booking> bookings;



    public Hotel() {
        this.bedroom = new ArrayList<Room>();
        this.meetingRoom = new ArrayList<Room>();
        this.diningRoom = new ArrayList<Room>();
        this.bookings = new ArrayList<Booking>();
    }


    public int getBedroom() {
        return bedroom.size();
    }

    public int getMeetingRoom() {
        return meetingRoom.size();
    }

    public int getDiningRoom() {
        return diningRoom.size();
    }

    public void addBedroomToHotel(Room room) {
        this.bedroom.add(room);
    }

    public void addMeetingRoomToHotel(Room room){
        this.meetingRoom.add(room);
    }

    public void addDiningRoomToHotel(Room room){
        this.diningRoom.add(room);
    }


    public void addGuestToRoom(Room room, Guest guest){
        room.addGuest(guest);
    }

    public void removeGuestFromRoom(Room room){
        room.removeGuest();
    }

    public ArrayList<Room> findByRoomType(String type){
        ArrayList<Room> foundRooms = new ArrayList<Room>();
        for(Room room : this.bedroom){
            if(room.getRoomType().equals(type)){
                foundRooms.add(room);
            }
        }
        return foundRooms;
    }



    public void bookRoom(Room room, int nightsBooked){
        Booking booking = new Booking(nightsBooked, room);
        this.bookings.add(booking);
    }

    public int numberOfBookings() {
        return this.bookings.size();
    }
}

