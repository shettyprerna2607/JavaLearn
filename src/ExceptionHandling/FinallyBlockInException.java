package ExceptionHandling;

public class FinallyBlockInException {
    public static void main(String[] args){
        int a[] = new int[5];
        System.out.println("Hello World");
        try{
            System.out.println(a[6]);
        }catch(Exception e){
            System.out.println("Value cannot be greater than 5");
        }finally {
            System.out.println("I will run even if the exception wont occur");
        }
        System.out.println("Welcome...");

    }
}
