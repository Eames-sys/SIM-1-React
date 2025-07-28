package Classwork;

public class Staffs {
   private String name = "Bimbo";
    private int age = 30;
    private String position = "Teacher";
    private String Address = "Teslim Street";

// public String getName(){
//     return name;
//    }
// public int getAge(){
//     return age;
// }
// public String getPosition(){
//     return position;
// }
// public String getAddress(){
//     return Address;
// }
 public Staffs(String name, int age, String position, String address){
     this.name = name;
     this.age = age;
     this.position = position;
     this.Address = address;
 }
 public Staffs(){

 }
 public String getName() {
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }
 public int getAge() {
     return age;
 }
 public void setAge(int age) {
     this.age = age;
 }
 public String getPosition() {
     return position;
 }
 public void setPosition(String position) {
     this.position = position;
 }
 public String getAddress() {
     return Address;
 }
 public void setAddress(String address) {
     Address = address;
 }

    @Override
    public String toString() {
        return "Staffs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Staffs staff = new Staffs();
        staff.name = "Bimbo";
        staff.age = 30;
        staff.position = "Teacher";
        staff.Address = "Teslim Street";
        System.out.println(staff);

        Staffs staff2 = new Staffs("Tush", 25, "Cleaner", "Yashin Street");
    }
}
