package Java_Basics;

public class Methods {
    //method declaration
    public static void printJava(){
        System.out.println("Hello Java");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void addNum(int num1 , int num2){
        int sum = num1 + num2;
        System.out.println("Sum"+sum);
    }
    public static void main(String[] args){
        //method call
        printJava();
//        printJava();   //runs repeatedly
//        printJava();
        printName("Prerana A Shetty");
        addNum(10,10);

    }

}
