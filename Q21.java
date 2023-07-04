package HARSH40;
public class Q21 {
    public static void main(String[] args) {
        // Create a shared buffer
        int bufferSize = 5;
        int[] buffer = new int[bufferSize];

        // Create a producer and a consumer
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        // Start the threads
        producerThread.start();
        consumerThread.start();
        System.out.println("**************************************************************\n");
 		System.out.println("Implemented by- Harsh Raj Mishra\t Class Roll no-40\t CSE(4)E");
 		System.out.println("\n**************************************************************");
    }
    
}

class Producer implements Runnable {
    private int[] buffer;
    private int nextIndex;
    private int value;
    private int iterations;

    public Producer(int[] buffer) {
        this.buffer = buffer;
        this.nextIndex = 0;
        this.value = 1;
        this.iterations = 0;
    }

    public void run() {
        try {
            while (iterations < 10) {
                synchronized (buffer) {
                    // Wait if the buffer is full
                    while (buffer[nextIndex] != 0) {
                        buffer.wait();
                    }

                    // Produce an item
                    System.out.println("Producing item: " + value);

                    // Put the item into the buffer
                    buffer[nextIndex] = value;

                    // Update the next index and value
                    nextIndex = (nextIndex + 1) % buffer.length;
                    value++;

                    // Notify the consumer that an item is produced
                    buffer.notify();

                    // Sleep for some time to simulate the production time
                    Thread.sleep(1000);

                    iterations++;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private int[] buffer;
    private int nextIndex;
    private int iterations;

    public Consumer(int[] buffer) {
        this.buffer = buffer;
        this.nextIndex = 0;
        this.iterations = 0;
    }

    public void run() {
        try {
            while (iterations < 10) {
                synchronized (buffer) {
                    // Wait if the buffer is empty
                    while (buffer[nextIndex] == 0) {
                        buffer.wait();
                    }

                    // Consume an item from the buffer
                    int item = buffer[nextIndex];

                    // Process the consumed item
                    System.out.println("Consuming item: " + item);

                    // Clear the consumed item from the buffer
                    buffer[nextIndex] = 0;

                    // Update the next index
                    nextIndex = (nextIndex + 1) % buffer.length;

                    // Notify the producer that an item is consumed
                    buffer.notify();

                    // Sleep for some time to simulate the consumption time
                    Thread.sleep(2000);

                    iterations++;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}