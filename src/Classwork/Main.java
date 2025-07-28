package Classwork;

import Abstraction.Animal;

public class Main {
    public static void main(String[] args) {
//        Kingdom obj = new Kingdom();
        Print orland = ()-> System.out.println("meoww");
        printAnimal(orland);
//        obj.Sound();
    }
    static void printAnimal(Print p) {
        p.print();
    }
}
