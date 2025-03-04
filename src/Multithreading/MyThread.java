package Multithreading;

// Creating our thread using Runnable Interface
class MyRunnable implements Runnable {
    public void run() {
        // Task for thread...
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of thread is: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        // Create an object of MyRunnable class
        MyRunnable t1 = new MyRunnable();
        // Helper class object
        Thread thr = new Thread(t1);
        thr.start();

        // Object of MyThread2
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
