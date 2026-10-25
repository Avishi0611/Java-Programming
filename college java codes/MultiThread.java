// Program: Demonstrate Multithreading in Java

// Thread class extending Thread
class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread class implementing Runnable interface
class ThreadB implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(700); // pause for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class MultiThread{
    public static void main(String[] args) {
        System.out.println("---- Multithreading Example ----");

        ThreadA t1 = new ThreadA();       // Using Thread class
        Thread t2 = new Thread(new ThreadB());  // Using Runnable interface

        t1.start();
        t2.start();

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
