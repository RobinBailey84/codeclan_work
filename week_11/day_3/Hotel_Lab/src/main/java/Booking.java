import java.util.ArrayList;

public class Booking {

    private Room room;
    private int nightsBooked;


    public Booking(int nightsBooked, Room room) {
        this.room = room;
        this.nightsBooked = nightsBooked;
    }

    public int nightsBooked(){
        return this.nightsBooked;
    }

    public double totalBill(){
        return this.nightsBooked * this.room.getRate();
    }
}
