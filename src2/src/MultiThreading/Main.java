package MultiThreading;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();
        Runnable task =()-> booking.BookingSeat(Thread.currentThread().getName());

        Thread t1 = new Thread(task,"User A");
        Thread t2 = new Thread(task,"User B");
        Thread t3 = new Thread(task,"User C");

        t1.start();
        t2.start();
        t3.start();
    }
}
