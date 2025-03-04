package Multithreading;

// Main class to test the Producer-Consumer synchronization
public class MainCompany {
    public static void main(String[] args) {
        // Create a shared Company object where producer and consumer will interact
        Company comp = new Company();

        // Create Producer and Consumer threads, passing the shared Company object
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        // Start both threads to begin execution
        p.start();
        c.start();
    }
}

