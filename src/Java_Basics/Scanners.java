package Java_Basics;

import java.util.Locale;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("Your name is : "+name.toUpperCase());
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is : "+age);



    }
}
