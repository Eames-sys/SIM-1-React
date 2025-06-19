import java.io.File;

public class Del {
    public static void main(String[] args) {
     int[] nums = {56,81,1,4,7};
    int min = nums[1];
    for(int i = 1; i < nums.length; i++) {
        if(nums[i] < min) {
            min = nums[i];
        }
    }
        System.out.println(min);
    }
    }

