package MultiThreading;

public class LearnMultiThreading implements Runnable {
    @Override
    public void run() {
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        LearnMultiThreading Multi = new LearnMultiThreading();
        Multi.run();
    }
}
