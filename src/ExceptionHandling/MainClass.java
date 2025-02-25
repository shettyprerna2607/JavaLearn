package ExceptionHandling;

public class MainClass {
    public static void main(String[] args){
        int a[] = new int[5];
        try{
            System.out.println(a[3]);
            int result = 5/0;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Value cannot be greater than 5");

        }catch (ArithmeticException e){
            System.out.println("Number cannot divide by zero");
        }
    }
}
