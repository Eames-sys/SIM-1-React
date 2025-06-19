package User;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Awe {
    public static void main(String[] args) {
        Vector<String> animal = new Vector<String>(List.of("ram","goat","camel","cow"));
        animal.set(3,"Monkey");
        System.out.println(animal);

        Stack<String> stack = new Stack<String>();

        stack.push("Toshiba");
        stack.push("Iphone");
        stack.push("Nokia");
        stack.push("Huawei");
        System.out.println(stack);


//
//        Stack<Integer> number = new Stack<>();
//        Stack<String> RomanNumeral = new Stack<>();
//       for (int i = 0; i < 3; i++) {
//           number.push(i);
//           RomanNumeral.push("i");
//           RomanNumeral.push("ii");
//           RomanNumeral.push("iii");
//       }
//       while (!RomanNumeral.isEmpty()) {
//           int num = Integer.parseInt(RomanNumeral.peek());
//           RomanNumeral.pop();
//           RomanNumeral.pop();
//           RomanNumeral.pop();
//           System.out.println(RomanNumeral);
//       }
//        stack.push(String.valueOf(number));

        //System.out.println(stark);
    }




    }


