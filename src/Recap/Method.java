package Recap;

public class Method {
    static void method() {
        System.out.println("run");
    }
    static int method2(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        method();
        int num = method2(1, 2);
        System.out.println(num);
    }
}
