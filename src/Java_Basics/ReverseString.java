package Java_Basics;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String estr = " ";      //estr - empty string
        char ch;
        for(int i = 0; i < str.length(); i++){
            // extracts each character
            ch = str.charAt(i);

            // adds each character in
            // front of the existing string
            estr = ch + estr;
        }
        System.out.println(estr);
    }
}

/* // Java program to Reverse String
// Using StringBuilder
import java.io.*;

class Main {

    public static void main(String[] args) {

        String s = "Geeks";

          // Object Initialised
        StringBuilder res = new StringBuilder();

        // Appending elements of s in res
        res.append(s);

        // reverse StringBuilder res
        res.reverse();

        // print reversed String
        System.out.println(res);
    }
}*/
