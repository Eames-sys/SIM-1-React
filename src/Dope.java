import java.util.Arrays;
import java.util.List;

public class Dope {
    public static void main(String[] args) {
        List<String> Any = Arrays.asList(
                "John","Jane","Jack","Dope"
        );
//
        Any.stream().filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                 .forEach(System.out::println);


    }
}
