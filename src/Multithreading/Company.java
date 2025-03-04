package Multithreading;

// Shared resource class for Producer-Consumer problem
public class Company {
    int n; // Variable to store produced item
    boolean f = false; // Synchronization flag: false = Producer's turn, true = Consumer's turn

    // Synchronized method for producing an item
    synchronized public void produce_item(int n) {
        while (f) {  // If f is true, producer must wait (Consumer's turn)
            try {
                wait(); // Wait until consumer consumes the item
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // Handle interruption exception
            }
        }

        this.n = n; // Store the produced item
        System.out.println("Produced: " + this.n);
        f = true; // Set flag to true, allowing consumer to consume
        notify(); // Notify waiting consumer thread
    }

    // Synchronized method for consuming an item
    synchronized public int consume_item() {
        while (!f) {  // If f is false, consumer must wait (Producer's turn)
            try {
                wait(); // Wait until producer produces an item
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // Handle interruption exception
            }
        }

        System.out.println("Consumed: " + this.n);
        f = false; // Set flag to false, allowing producer to produce again
        notify(); // Notify waiting producer thread
        return this.n; // Return consumed item
    }
}
