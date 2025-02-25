package Java_OOPS;
class TommyVecetti{
    void hitting(){
        System.out.println("Hitting...");
    }
    void running(){
        System.out.println("Running...");
    }
    void firing(){
        System.out.println("Firing...");
    }
}

public class ViceCityGame {
    public static void main(String[] args){
        TommyVecetti tv = new TommyVecetti();
        tv.hitting();
        tv.running();
        tv.firing();


    }
}
