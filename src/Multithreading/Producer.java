package Multithreading;

// Producer class extends Thread to run as a separate thread
public class Producer extends Thread {
    Company c; // Shared Company object to interact with the consumer

    // Constructor to initialize the shared Company object
    Producer(Company c) {
        this.c = c;
    }

    // Run method executes when the thread starts
    public void run() {
        int i = 1; // Start item production from 1

        while (true) { // Infinite loop to continuously produce items
            this.c.produce_item(i); // Call the produce method from Company

            try {
                Thread.sleep(1000); // Simulate delay of 1 second before producing the next item
            } catch (Exception e) {
                e.printStackTrace(); // Print exception details if an error occurs
            }

            i++; // Increment item number for the next production
        }
    }
}
