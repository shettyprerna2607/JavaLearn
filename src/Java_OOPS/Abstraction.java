package Java_OOPS;

import javax.print.attribute.standard.JobHoldUntil;

abstract class Animal{    //Animal class is irrelevant its info is necessary to show the user
    abstract void walk();
    Animal(){    //constructor
        System.out.println("Creating a animal");

    }
    public void eat(){
        System.out.println("Animal eats food");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Create a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Horse horse = new Horse();
//        horse.walk();
//        horse.eat();
//
//        Chicken chicken = new Chicken();
//        chicken.walk();

    }
}
