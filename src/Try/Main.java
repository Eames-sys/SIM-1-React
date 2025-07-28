package Try;

import Classwork.Print;

public class Main {
    public static void main(String[] args) {
       Interr w = ()-> System.out.println("i am running");
       printRun(w);
//       work.run();

    }
    static void printRun(Interr r) {
        r.run();
    }
}
