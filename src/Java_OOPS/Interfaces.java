package Java_OOPS;
interface Animals{      //inside interface there must not be non abstraction function
    int eyes = 2;
    void walk();
}

//multiple inheritance it is done using interfaces ot by class
interface Herbivore{

}

class Monkey implements Animals,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class Interfaces {
    public static void main(String[] args){

    }
}
