import java.util.Scanner;

public class Excercise1{
   public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int num, elementos = 0, suma = 0;
    float media;

    System.out.println(" type a number ");
        num = entry.nextInt();

    while(num >=0){
         suma += num;
          elementos ++;

        System.out.println(" type a number ");
        num = entry.nextInt();
    }
     if(elementos == 0){
        System.out.println("there is no division by 0");
     }else{
        media = suma/elementos;
        System.out.println("the average is: " + media);
     }
   }
}