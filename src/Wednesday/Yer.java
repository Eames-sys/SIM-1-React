package Wednesday;

import java.util.Arrays;
import java.util.List;

public class Yer {
    String name = "Emma";
    double age = 18;
    String complexion = "Dark";
    String height = "Middle";

//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public String getComplexion() {
//        return complexion;
//    }
//    public String getHeight() {
//        return height;
//    }
    public Yer(String name, String age, String complexion, String height) {
        this.name = name;
        this.age = Integer.parseInt(age);
        this.complexion = complexion;
        this.height = height;
    }

    public Yer() {

    }

    public Yer(String chidi, int amount, String tall, String middle) {
    }

    @Override
    public String toString() {
        return "name: "+ name
                + " " +
                age + " "
                +complexion + " "
                + height;
    }


    public static void main(String[] args) {
        List<Yer> yers = Arrays.asList(
                new Yer("Chidi",15,"tall","Middle"),
                new Yer("Chidinma",150,"tall","Middle")
        );

        System.out.println(yers);
        yers.stream()
                .filter(yer -> yer.getAmount() > 0)
                .forEach(System.out::println);


//        Yer yer = new Yer();
//        yer.name = "Emma";
//        yer.age = 18;
//        yer.complexion = "Dark";
//        yer.height = "Middle";
//        System.out.println(yer.toString());
    }

    private double getAmount() {
        return 0;
    }
}
