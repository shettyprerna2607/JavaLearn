package Java_Basics;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String original = sc.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
