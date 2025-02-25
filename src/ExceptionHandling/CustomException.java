package ExceptionHandling;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) /*throws MyException*/ {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a age : ");
        int age = sc.nextInt();
        try{
            if(age > 100){
                throw new MyException("This is my error");
                //throw new ArithmeticException("More than 100 not allowed");
            }else {
                System.out.println("Your age is : "+ age);
            }
        }catch (Exception e){
            System.out.println(e);
        }



    }
}
class MyException extends Exception{
    public MyException(String message){
        super(message); //it will call its parent constructor
    }

}
