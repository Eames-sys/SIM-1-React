package Wednesday;

public class Service {
    final static double pi = 3.14;
    public static  String someNames(){
        String name = "chibuzor";
        String address = "shomolu";
        int age = 20;
        return name + address;
    }
    public static void main(String[] args) {
        Service service= new Service(); //instaciation
        System.out.println(Service.someNames());
        System.out.println();

        //RANDOM
        int age =50;
        String name= "shola";
        int x = 12;
        int y = 20;

        /*System.out.println("how are you?");
        System.out.println("i'm fine");*/
        System.out.println("Yo " + name);
        System.out.println(x + y);

        // STUDENT ID
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

           //AREA OF A RECTANGLE
        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

// Calculate the area of a rectangle
        area = length * width;

// Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);


         //DUPLICATING WORDS
        String word = "i hate u";
        for (int i = 0; i < 50; i++) {
            System.out.println(word);
        }

        //PERCENTAGE REAL-LIFE EXAMPLE
        // Set the maximum possible score in the game to 500
        int maxScore = 400;

// The actual score of the user
        int userScore = 341;

/* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 50.0f;

        System.out.println("User's percentage is " + percentage);


    }
}
