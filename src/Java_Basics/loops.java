package Java_Basics;
import java.util.Scanner;
public class loops {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int input = 0;
//        do{
//            System.out.print("Input a number : ");
//            input = sc.nextInt();
//            System.out.println("Here is your number " + input);
//        }while(input >= 0);
//
//        System.out.println("STOP!!!");


        // Break and Continue
        int i =  1;
        while(true){     //if the "while" is "true" there will be infinite loop formation
            if (i == 3){
                i++;
                continue;
                }
            System.out.println(i);
            i++;
            if(i > 5)
                break;


        }


    }
}
