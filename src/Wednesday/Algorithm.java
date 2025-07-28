package Wednesday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Algorithm {
    public static void main(String[] args) {
            List<String> pl = Arrays.asList(
                   "Ade","Bolu","Angela","Anelka"
        );
//
        pl.stream().filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

    }
}
