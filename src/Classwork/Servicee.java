package Classwork;

public class Servicee {
    public String jamb(int score){
        if (score >= 200){
            System.out.println("universities");
        }else if (score <= 180){
            System.out.println("polytechnic");
        }else if (score <= 150) {
            System.out.println("college");
        }
        return score + "";

   /* final static double pi = 3.14;
    public int someNames(int a, int b) {
        return a + b;*/
    }
    public static void main(String[] args) {
        Servicee servicee= new Servicee();
        System.out.println("hello world");
        //System.out.println(servicee.someNames(6,7));
        System.out.println(servicee.jamb( 266));
    }

}
