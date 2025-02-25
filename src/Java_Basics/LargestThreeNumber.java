package Java_Basics;
import java.util.Scanner;
public class LargestThreeNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int b = sc.nextInt();
        System.out.print("Enter Num 3 : ");
        int c = sc.nextInt();

        // Finding the largest using Math.max()
        /*int largest = Math.max(num1, Math.max(num2, num3));*/

        if(a >= b && a >= c){
            System.out.println("Num 1 is largest");
        }else
            if (b >= a && b >= c){
                System.out.println("Num 2 largest");
            } else
                if (c >= a && c >= b){
                    System.out.println("Num 3 is largest");
                }
    }
}
