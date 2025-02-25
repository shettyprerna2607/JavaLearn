package Java_Basics;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your budget : ");
        int budget = sc.nextInt();
        if(budget < 10){
            System.out.println("Cannot buy anything");
        } else if(budget > 10 && budget < 50) {
            System.out.println("Can get one thing");
        }else {
            System.out.println("Can get both");
        }

        }


    }

