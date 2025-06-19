package Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> Names) {
        List<String> reversed = new ArrayList<>();
        for (int i = 0; i < Names.size(); i++) {
            if (Names.get(i).equals("")) {
                return reversed;
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        List<String> Names = new ArrayList<>();
        Names.add("Hannah");
        Names.add("Michael");
        System.out.println(Names);
    }

}
