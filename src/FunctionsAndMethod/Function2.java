package FunctionsAndMethod;
import java.util.*;
public class Function2 {
    public static int CalcSum(int num1,int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 :");
        int num2 = sc.nextInt();
        int sum = CalcSum(num1,num2);
        System.out.println("Sum of two numbers is :"+ sum);

    }
}
