package Finale;

public class Main {
    public static void main(String[] args) {
        Interf I  = ()-> System.out.println("The Bandit flies");
//        I.fly();
        Action(I);
    }
    static void Action(Interf i) {
        i.fly();
    }
}
