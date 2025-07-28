package Try;

import java.util.Arrays;
import java.util.List;

public class Lamb {
    static String name = "Idris";
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        int Output = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(Output);

        System.out.println(name.toUpperCase());
    }
}
