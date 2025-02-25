package Java_Basics;
import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random()*100); //Generate random number
        int userNumber;
        do {
            System.out.println("Guess the number (1 - 100) : ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber) {
                System.out.println("Congrats!! you guessed correct");
                break;
            } else
               if (userNumber > myNumber){
                   System.out.println("Your number is too large");
               } else {
                   System.out.println("Your number is too small");
               }
        }while (userNumber >= 0);

        System.out.print("Guessed number was : "+myNumber);

    }
}
