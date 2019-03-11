import java.util.ArrayList;

public class Room {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;
    private double rate;

    public Room(int roomNumber, int capacity, String roomType, double rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getRoomType(){
        return roomType;
    }

    public double getRate(){
        return rate;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(){
        this.guests.remove(0);
    }

    public int guestCount(){
        return this.guests.size();
    }
}
