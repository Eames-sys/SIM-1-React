package User;

public class Mark {
    public static boolean IsPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            } else if (number % i == 0) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsPrime(7));
    }
}
