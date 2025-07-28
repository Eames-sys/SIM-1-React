package Classwork;

import Todo.Staff;

public class Manager extends Staff {
    public Manager(String name, int age, String position, String address) {
        super(name, age, position, address);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Miss Etse", 27, "Manager", "Donald Street");
        System.out.println(manager.toString());
    }
}
