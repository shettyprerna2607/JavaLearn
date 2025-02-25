package Java_Basics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 3 ; i <= n ; i++){
            int next = a + b;
            System.out.println(next+ " ");
            a = b;  // Move 'b' to 'a'
            b = next;   // Move 'next' to 'b'
        }
    }
}
