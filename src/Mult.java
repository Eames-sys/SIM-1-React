import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Mult {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,2,7,1,8,3);
//        Stream<Integer> stream = nums.stream();
//        Stream<Integer> MultipleNum = stream.map(n->n*2);
//        MultipleNum.forEach(n->System.out.println(n));

        nums.stream().filter(n->n%2 == 0).sorted().forEach(n->System.out.println(n));

        for(int i = 0; i<= nums.size(); i++){
//            System.out.println(nums.get(i)*2);
        }
    }
}
