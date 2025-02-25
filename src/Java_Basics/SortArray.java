package Java_Basics;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //2d array
        int[][] fianlMarks = {{90,94,97},{98,96,93}};
        System.out.println(fianlMarks[1][0]);
     }

}
