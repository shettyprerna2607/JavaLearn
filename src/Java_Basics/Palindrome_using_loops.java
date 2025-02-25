package Java_Basics;
import java.util.Scanner;
public class Palindrome_using_loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String original = sc.nextLine();
        String reversed = "";  // Variable to store reversed string
        for (int i = original.length() - 1; i >= 0; i--){  // Loop to reverse the string manually
            reversed += original.charAt(i);  // Append characters in reverse order
        }
        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
