package Java_OOPS;
class Student{
    String name;
    int age;

    //Method overloading - Methods will be same arguements are different
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age ){
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "ramya";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age);

    }
}
