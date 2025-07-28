package MultiThreading;

public class Booking {
    private int availableseat = 1;

    public synchronized void BookingSeat(String name) {
        if (availableseat > 0) {
            System.out.println(name+ " has booked a seat ");
            availableseat--;
            System.out.println(name+ " successfully booked (seat left = "+ availableseat +")");
        }else{
            System.out.println(name+ " failed to book a seat (seat left = "+ availableseat +")");
        }
    }
}
