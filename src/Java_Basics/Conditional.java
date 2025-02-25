package Java_Basics;

public class Conditional {
    public static void main(String[] args){
        boolean isSunUp = false;
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        int age = 15;
        if(age >= 18)
            System.out.println("Eligible for vote");
        else
            System.out.println("Not eligible for vote");

        boolean isAged = true;
        if(!isAged)
            System.out.println("Is Aged");
        else
            System.out.println("Not Aged");



    }
}