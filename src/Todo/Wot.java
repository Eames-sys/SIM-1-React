package Todo;

public class Wot {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("true");
                } else if (nums[i] > nums[j]) {
                    System.out.println("false");
                }
            }
        }
    }
}



//    public static void main(String[] args) {
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

