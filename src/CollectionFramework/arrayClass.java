package CollectionFramework;
import java.util.Arrays;

public class arrayClass {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(num,4);
        System.out.println("The index of element 4 is: "+index);

        Integer[] numbers = {10,2,15,4,25,6};
        /*Arrays.fill(numbers,12);*/
        Arrays.sort(numbers);
        for (int i : numbers){
            System.out.println(i + " ");

        }


    }
}
