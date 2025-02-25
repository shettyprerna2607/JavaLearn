package CollectionFramework;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Rakesh");       //size = n  when size increases it will be n + n/2 +1
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  //this will add 4 at end of the list
        System.out.println(list);

        list.add(2,30);  //this will add the 30 based on the index
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();  //Creating new list
        newList.add(150);
        newList.add(160);

        list.addAll(newList);   //this will add all the elements to the newlist
        System.out.println(list);

        System.out.println(list.get(2)); //this will get element from indexing

        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        System.out.println(number);

        for (int i=0;i<number.size();i++){
            System.out.println("The element is : "+ number.get(i));
        }

        for (Integer element: number){
            System.out.println("Foreach element is : "+element);
        }

        Iterator<Integer> it = number.iterator();
        while (it.hasNext()){    //until there is a next element in a array list it will keep on iterating
            System.out.println("iterator : "+ it.next());
        }

        number.set(2,200);  //updates the element from the array
        System.out.println(number);

        System.out.println(number.contains(60)); //this  will check whether the element is present in the list or not

        number.remove(1); //this will remove element from the list using indexing
        System.out.println(number);

        number.remove(Integer.valueOf(50)); //this will remove the element value present in the list
        System.out.println(number);

        number.clear(); //this will clear all the array list
        System.out.println(number);






    }
}
