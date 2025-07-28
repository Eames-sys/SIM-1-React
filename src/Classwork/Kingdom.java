package Classwork;

import Abstraction.Animal;

public class Kingdom implements Print {
    public String animal;

    @Override
    public void print() {
        System.out.println("meoww");
    }
}
