package User;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Iron {

    public static void main(String[] args) {
        List<String> Names = new ArrayList<String>(List.of("JS","React","C#","Java"));
        List<Integer> Keys = new ArrayList<Integer>(List.of(5,9,2,13));
        Keys.set(1,8);
        System.out.println(Keys);
         for (int i = 0; i < Names.size(); i++) {
             if (Names.get(i) == ("JS")) {
                 Names.set(i,("Net"));
             }
             System.out.println(Names);
         }

        for (Integer Key : Keys) {
            if (Key == 9) {
                //System.out.println(Key);
                break;

            }
}// System.out.println(Names);

    }

}
