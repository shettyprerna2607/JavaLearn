package Multithreading;
class UserThread extends Thread{
    public void run(){
        //perform task for thread...
        System.out.println("This is user defined thread");
    }
}
public class ThreadOP {
    public static void main(String[] args) {
        System.out.println("Program started...");
        int x = 56 + 34;
        System.out.println("Sum is "+ x);
        //Thread...
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current running thread is = "+ tname);

        //setName
        t.setName("myMain");
        System.out.println(t.getName());
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        };

        System.out.println(t.getId());

        //start user defined thread
        UserThread thread = new UserThread();
        thread.start();

        System.out.println("Program ended...");
    }
}
