package CollectionFramework;

import java.util.*;

public class collectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(26);
        list.add(25);
        System.out.println("Min element : "+ Collections.min(list));
        System.out.println("Min element : "+ Collections.max(list));
        System.out.println(Collections.frequency(list,9));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());   //sort in reverse order
        System.out.println(list);

    }
}
