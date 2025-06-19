import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Abs1 {
    public static void main(String[] args) throws IOException {
        File file = new File("ads1.txt");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            String info = read.nextLine();
            System.out.println(info);
        }
//        if (!file.exists()) {
//            System.out.println("File does not exist");
//        }else{
//            System.out.println("File exists");
//        }

        FileWriter drawer = new FileWriter(file);
        drawer.write("Java is a programming language");
        drawer.close();


    }
}
