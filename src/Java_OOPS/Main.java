package Java_OOPS;

class Pen{
    String color; //data members - variables
    String type; //ballpen , gelpen    //data members - variables
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}
public class Main{
    public static void main(String[] args){
       Pen pen1 = new Pen();  //Object
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();  //call function from child class using object

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball pen";

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();

    }
}
