package Classwork;

import Todo.Staff;

public class OfficeAssistant extends Staff {
    public OfficeAssistant(String name, int age, String position, String address) {
        super(name, age, position, address);

    }

    public static void main(String[] args) {
        OfficeAssistant OA = new OfficeAssistant("Miss Violet", 26, "OfficeAssistant", "Benson Street");
        System.out.println(OA);
    }
}
