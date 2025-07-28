package Wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Xenon {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ali",15),
                new Person("John",20),
                new Person("Angela",18),
                new Person("Ade",12)
        );
        personList.sort(Comparator.comparingInt(p -> p.age));
        personList.forEach(System.out::println);
    };

}
