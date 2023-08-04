import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        int num;
       

        System.out.println("type a number");
        num = entry.nextInt();
         
        for(int second = 0 ; second <= num ; second++  ){
            System.out.println( second);

        }
    }
}
