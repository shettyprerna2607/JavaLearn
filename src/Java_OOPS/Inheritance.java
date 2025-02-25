package Java_OOPS;

//Inheritance - creating a new classes from the existing class
//It  is said as "method overriding" where there is same method, same arguement but in different subclasses

//Type 1 : Single level inheritance program
class Shape{   //base class or parent class
    String color;
    public void area(){
        System.out.println("Displays area");
    }
}

//Triangle is a derived class that takes the properties (Inheritant / extent) of Shape class
class Triangle extends Shape{   //subclass or child class or derived class
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}

//Type 2 : Multi level inheritance program

//class EquilaterialTriangle extends Triangle{     //EquilaterialTriangle is a derived class of base class Triangle
//    public void area(int l , int b){
//        System.out.println(1/2*l*b);
//    }
//}

//Type 3 : Hierarchial inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "blue";
    }
}

/*
4 types of inheritance
1. single level inheritance - contains of 1 base class and 1 derived class
2. multi level inheritance - derived class becomes base class and can make a drived class for the above base class
-hierarchial inheritance -  1 base class contains of multiple derived class
-hybrid inheritance - contains of different inheritance (single level inheritance,multi level inheritance,hierarchial inheritance)
 */
