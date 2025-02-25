package FunctionsAndMethod;
import java.util.*;
public class Function3 {
    public static int multiply(int a , int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        int product = multiply(a,b);
        System.out.println("The product of two numbers is :" + product);

    }
}
