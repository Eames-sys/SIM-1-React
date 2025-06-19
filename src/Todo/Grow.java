package Todo;
import java.util.HashSet;
public class Grow {
        public static boolean hasDuplicates(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for (int num : nums) {
                if (!seen.add(num)) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] input = {1, 2, 3, 1};
            System.out.println(hasDuplicates(input));
        }
    }


