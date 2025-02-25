package Java_OOPS;

class Students{
    int rollno;
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.rollno);
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Students(){     //non parametarized constructor
//        System.out.println("Constructor called");
//    }

//    Students(int rollno , String name , int age){   //parametarized constructor
//        this.rollno = rollno;
//        this.name = name;
//        this.age = age;
//    }

    Students(Students s2){   //copy constructor
        this.rollno = s2.rollno;
        this.name = s2.name;
        this.age = s2.age;
    }
    Students(){      //create a empty constructor for s1 , bcz s1 properties will assign to s2

    }

}

public class School {
    public static void main(String[] args){
        Students s1 = new Students();   /*"new" is a keyword where inside the memory key space will be allocated. In that empty space object will be allocated*/
        s1.rollno = 1;
        s1.name  = "Aman";
        s1.age = 12;

        Students s2 = new Students(s1);
        s2.printInfo();

//        Students s2 = new Students();  //Students() - Constructor : used to construct object, constructor name must be same as class name
//        s2.rollno = 2;
//        s2.name = "Bhanu";
//        s2.age = 12;
//

    }
}

/* 3 types of constructor
- non parametarized constructor
- parametarized constructor
- copy constructor

-java is a automatic garbage collector
 */
