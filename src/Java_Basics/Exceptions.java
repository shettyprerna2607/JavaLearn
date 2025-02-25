package Java_Basics;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        int[] marks = {97,98,95};
        try {
            System.out.println(marks[7]);
        }catch (Exception e){
            //do something after catching
            System.out.println("The marks is invalid");
        }
    }
}
