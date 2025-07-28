package Classwork;

import Todo.Staff;

public class Instructor extends Staff {

    public Instructor(String name, int age, String position, String address) {
        super(name, age, position, address);
    }

    public static void main(String[] args) {
        Instructor staff = new Instructor("Mr Phillip", 35, "Senior Staff", "ilaoye Street");

    }
}
