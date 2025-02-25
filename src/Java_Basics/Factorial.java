package Java_Basics;
public class Factorial {
    public static int Factorial(int n){    //recursively call the function
        if(n == 0)
            return 1;
        else
            return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Factorial(3));
        System.out.println(Factorial(5));
        System.out.println(Factorial(0));

    }
}
