package Inheritance;

public class Parent {
    public String name;
    private int age;
    private String address;
    private String phone;

    public double netWorth(){
        double netWorthOfCars = 120000.0;
        double netWorthOfHouses = 876261.0;
        double netWorthOfGardens = 453782.0;


        return netWorthOfCars + netWorthOfHouses + netWorthOfGardens;
    }

    public Parent(){

    }
 public Parent(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
 }
    @Override
    public String toString() {
        return "People{" +
                "name='" + name +'\'' +
                ", age='" + age +'\'' +
                ", address='" + address +'\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getAge() {

        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static  void main(String[] args) {
        Parent parent = new Parent();
        parent.name = "jeff";
        parent.age = 67;
        parent.address = "Thompson road";
        System.out.println(parent);
        System.out.println(parent.netWorth());

        Parent parent1 = new Parent();
        parent1.name = "phil";
        parent1.age = 45;
        parent1.address = "Toff road";
        System.out.println(parent1);
        System.out.println(parent1.netWorth());

        Parent parent2 = new Parent("chisom","Aguda",20);
        System.out.println(parent2);
    }
}


