package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args){   //inside set duplicate elements are not allowed
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(54));

        System.out.println(set.isEmpty());  //set is not empty so it will display false otherwise true

        System.out.println(set.size());  //it will check the size of the set

        set.clear();   //it will clear set values

        System.out.println(set.isEmpty());   //true bcz set is empty

    }
}
