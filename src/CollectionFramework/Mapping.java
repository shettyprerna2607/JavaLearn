package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args){
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One" , 1);
        numbers.put("Two" , 2);
        numbers.put("Three" , 3);     //keys are always unique

//        if(!numbers.containsKey("Two")){
//            numbers.put("Two" , 02);
//        }
        System.out.println(numbers.containsValue(3));

        numbers.putIfAbsent("Two",02);
        System.out.println(numbers);

        for (Map.Entry<String,Integer> e : numbers.entrySet() ){
            System.out.println(e);
            System.out.println(e.getKey());   // it will display entry key
            System.out.println(e.getValue());  //it will display entry value

        }
        for (String key : numbers.keySet() ){     //it will return only the key set
            System.out.println(key);
        }
        for (Integer value : numbers.values()){   //it will return only the key values
            System.out.println(value);
        }


    }
}
