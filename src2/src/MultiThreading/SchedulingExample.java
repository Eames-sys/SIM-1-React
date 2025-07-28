package MultiThreading;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulingExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task =()-> System.out.println("Running at "+new Date());
        Runnable task2 =()-> System.out.println("Running at "+ java.time.LocalDateTime.now());

//        scheduler.scheduleAtFixedRate(task,0,3, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(task2,0,3, TimeUnit.SECONDS);

    }
}
