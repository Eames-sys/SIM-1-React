public class Demo {
    public static void main(String[] args) {
        for( int i = 0; i < 6; i++ ){
            System.out.println(i);
        }

        for (int i = 2; i <= 10; i+=2 ){
            System.out.println(i);
        }

        String[] Cars = {"bentley","benz","rolls-royce"};
        Cars[1]="lambo";
        for (String i : Cars){
            System.out.println(i);
        }
            System.out.println(Cars.length);
    }

}
