package Classwok;

public class Main {
    public static void main(String[] args) {
//        Function f = new Function();
        Redo fn = ()->System.out.println("HIM");
//        printPerson.Todo();
//        fn.Todo();
        printPerson(fn);

    }
    static void printPerson(Redo f) {
        f.Todo();
    }
}
