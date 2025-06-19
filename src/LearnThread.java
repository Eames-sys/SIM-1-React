public class LearnThread {
    public static void main(String[] args) {
        LearnThread t = new LearnThread();
        System.out.println("i am eating");
        t.run();
    }
    public void run() {
        System.out.println("i am running");
    }
}
