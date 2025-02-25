package CollectionFramework;

import java.util.Stack;

public class Stacklist {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Monkey");
        animals.push("Donkey");
        System.out.println("Animals are : " +animals);

        System.out.println("Animals are : " +animals.peek());   //this will display last element from the stack
        animals.pop();
        System.out.println("Animals are : " +animals.peek());

    }
}
