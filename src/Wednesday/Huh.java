package Wednesday;

import java.util.HashMap;
import java.util.Map;

public class Huh {
    public static int addNumerals(String str) {
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        int preValue = 0;

        for (int i = str.length() -1; i>=0;  i--){
            int current = roman.get(str.charAt(i));
            // System.out.println(current);
            if(current < preValue){
                total -= current;
            }else {
                total += current;
            }
            preValue = current;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(addNumerals("CXIX"));
    }
}

