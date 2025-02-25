package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashset {
    public static void main (String[] args){
        Set<Integer> lhs = new LinkedHashSet<>();   //the order of the set element is as it is....It has a properties of set and linkedlist
        lhs.add(2);
        lhs.add(54);
        lhs.add(21);
        lhs.add(65);
        lhs.add(32);
        System.out.println(lhs);
        lhs.remove(54);
        System.out.println(lhs);

        System.out.println(lhs.contains(54));

        System.out.println(lhs.isEmpty());  //set is not empty so it will display false otherwise true

        System.out.println(lhs.size());  //it will check the size of the set

        lhs.clear();   //it will clear set values

        System.out.println(lhs.isEmpty());   //true bcz set is empty
    }
}
