import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ads {
   public static void main(String[] args) throws IOException {
       File file = new File("ads.txt");
       FileWriter writer = new FileWriter(file);
       writer.write("i am a boy");
       writer.close();
       file.createNewFile();
   }
   /*try{
       File file = new File("ads.txt");
       file.createNewFile();
       }catch(IOException e) {
       throw new RuntimeException(e);
       }
    */

}
/*try{
       File file = new File("ads.txt");
       file.createNewFile();
       }catch(IOException e) {
       throw new RuntimeException(e);
       }
    */
//        try{
//            int[] nums = {4,2,5};
//            System.out.println(nums[10]);
//        }catch (Exception e){
//            System.out.println("Error 404");
//            throw new RuntimeException("The index is out of range");
//
//        }
//        try{
//            int[] numbers ={8,5,6};
//            System.out.println(numbers[5]);
//        } catch (Exception e) {
//            System.out.println("It is not possible");
//        }
//    public String allow(int age){
//        if (age == 18){
//            System.out.println("you are allowed");
//        }else if (age <= 18){
//            System.out.println("you are not allowed");
//        }
//        return age + "";
//           int age = 0;
//           if (age < 18) {
//               throw new ArithmeticException("Access denied");
//           } else {
//               System.out.println("Access denied");
//           }
//       }
//           int a = 100 / 0;
//           int[] values = {9, 0, 4};
//           int answer = values[29];
//       }catch (ArithmeticException e) {
//           System.out.println("Invalid details" + e.getMessage());
//
//       }catch(ArrayIndexOutOfBoundsException e) {
//           System.out.println("the array does not exist" + e.getMessage());
//       }
//   }



