package Wednesday;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Mac {
    public static void main(String[] args) {
        List<Integer> Cup = new ArrayList<Integer>(List.of(5,9,2));
        System.out.println(Cup);

        Consumer<Integer> method = (x) -> System.out.println(x);
        Cup.forEach(method);
//        Cup.forEach((n) -> System.out.println(n));
//        Cup.forEach(System.out::println);
//        for (int i = 0; i < Cup.size(); i++) {
//            System.out.println(Cup.get(i));
//        }
    }
}
