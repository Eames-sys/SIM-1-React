public class School {
   static void nameOfSchool() {
        System.out.println("i am going to School");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        School myObj = new School(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method
    }
}
