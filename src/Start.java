import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static List<String> findStart(List<String> Names){
        List<String> start = new ArrayList<>();

        for (int i = 0; i < Names.size(); i++){
            String name = Names.get(i);
            if (isPalindrome(name)){
               start.add(name);
            }
        }

        return start;
    }

    private static boolean isPalindrome(String Names){
        int left = 0;
        int right = Names.length();
        while (left < right){
            if (Names.charAt(left) != Names.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Hannah"));

    }

        }




//    public static void main(String[] args) {
      /*  List<String> Pupil = new ArrayList<String>();
        Pupil.add("Chisom");
        Pupil.add("David");
        Pupil.add("John");
        Pupil.add("Mary");*/

        //System.out.println(Pupil);

//        List<Integer> Numbers = new ArrayList<Integer>();
//        Numbers.add(34);
//        Numbers.add(70);
//        Numbers.add(78);
//        Numbers.add(1);
//        Numbers.add(29);

        //System.out.println(Numbers.get(args.length));

//        List<Integer> Numbers = new ArrayList<>();
//        Numbers.add(3);
//        Numbers.add(5);
//        Numbers.add(3);
//        Numbers.add(2);
//        Numbers.add(5);
//        Numbers.add(6);
//
//    }
//    public static void duplicateRemove(List<Integer> Numbers) {
//        for (int i = 0; i <Numbers.size(); i++) {
//            Integer currentNumbers = Numbers.get(i);
//
//            for(int j=i + 1; j < Numbers.size(); ){
//                if (Numbers.get(j).equals(currentNumbers)) {
//                    Numbers.remove(j);
//                }else{
//                    j++;
//                }
//            }
//            System.out.println(Numbers);
//        }
//
//    }
//}

