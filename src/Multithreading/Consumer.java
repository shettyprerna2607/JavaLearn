package Multithreading;

// Consumer class extends Thread to run as a separate thread
public class Consumer extends Thread {
    Company c; // Shared Company object to interact with the producer

    // Constructor to initialize the shared Company object
    Consumer(Company c) {
        this.c = c;
    }

    // Run method executes when the thread starts
    public void run() {
        while (true) { // Infinite loop to continuously consume items
            this.c.consume_item(); // Call the consume method from Company

            try {
                Thread.sleep(2000); // Simulate delay of 2 seconds before consuming the next item
            } catch (Exception e) {
                e.printStackTrace(); // Print exception details if an error occurs
            }
        }
    }
}
