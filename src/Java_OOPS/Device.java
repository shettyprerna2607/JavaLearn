package Java_OOPS;
class CellPhone{
    void printRinging(){
        System.out.println("Ringing...");
    }
    void printVibrating(){
        System.out.println("Vibrating...");
    }
}

public class Device {
    public static void main(String[] args){
        CellPhone phone = new CellPhone();
        phone.printRinging();
        phone.printVibrating();

    }
}
