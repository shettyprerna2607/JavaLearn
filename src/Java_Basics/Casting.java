package Java_Basics;

public class Casting {
    public static void main(String[] args){
        //explicit
       float price = (float)150.0; //higher datatype
       int TotalPrice = (int) price + 150; //lower datatype
        System.out.println(TotalPrice);

        //implicit
        int p = 100; //lower datatype
        long fp = p + 500; //higher datatype
        System.out.println(fp);

        /*final - which is same as const variable which is used in JS where the value cannot be reassign*/
        final float PI = 3.14F;
        //PI = 1.1; /*Cannot reassign*/

        //Increment and Decrement operator ++ & --
        int num = 1;
        System.out.println(num++); //1
        System.out.println(num); //2

        System.out.println(++num); //2
        System.out.println(num); //2




    }
}
