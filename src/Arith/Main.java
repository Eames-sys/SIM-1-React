package Arith;

public class Main {
    public static void main(String[] args) {
        Duff duff = new Duff() {
            @Override
            public int Arithmetic(int a, int b) {
                return a * b;
            }
            Duff duff = (a, b)-> a * b;
        };
        System.out.println(duff.Arithmetic(19, 2));
    }
}
