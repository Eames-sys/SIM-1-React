import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Aray {
    int num;
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,2,7,1,8,3);
   for (int i=1; i<nums.size(); i++){
//

        }
        System.out.println(nums);
//        System.out.println(nums.toArray().length);
//        nums.forEach(n -> System.out.println(n));
//        nums.forEach(System.out::println);
        Stream<Integer> data = nums.stream();
//        System.out.println(data.sorted());

        Stream<Integer> sortedNumber = data.sorted();
        sortedNumber.forEach(n -> System.out.println(n));
//        System.out.println(sortedNumber);
//        data.forEach(y-> System.out.println(y));
//        data.forEach(y-> System.out.println(y));
    }
}
