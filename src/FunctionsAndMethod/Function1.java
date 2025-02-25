package FunctionsAndMethod;
import java.util.*;
public class Function1 {
    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter Your Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        PrintMyName(name); //function is called

    }
}
