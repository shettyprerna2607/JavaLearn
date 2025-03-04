package Multithreading;

// Creating thread using Thread class
class MyThread2 extends Thread {
    public void run() {
        // Task for thread...
        for (int i = 10; i >= 1; i--) {
            System.out.println("Value of thread2 is = " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
