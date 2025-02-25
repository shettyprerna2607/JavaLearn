package Java_Basics;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true; //Assume n is prime
        if(n <= 1) {
            isPrime = false; //Numbers <=1 are not prime
        }else{
            for (int i = 2 ; i <= n/2 ; i++){  //Loop from 2 to n/2
                if(n % i == 0) {  //If n is divisible by i, it's not prime
                    isPrime = false;
                    break; //stop checking further
                }

                }
            }
        //Prime result
        if(isPrime){
            System.out.println(n + " Prime Number ");
        } else {
            System.out.println(n + " Not Prime Number ");
        }





        }
    }

