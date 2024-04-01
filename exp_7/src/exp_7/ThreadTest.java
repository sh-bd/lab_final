package exp_7;

import java.lang.*;

public class ThreadTest extends Thread {
    static {
        Thread t = Thread.currentThread();
        System.out.println("ThreadTest is loaded by " + t.getName() + " thread");
        t.setName("vishal");
        System.out.println("Changed the name of thread to 'vishal'");
        System.out.println("Suspending thread for 5 seconds");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String arr[]) {
        Thread t = Thread.currentThread();
        System.out.println("main() is invoked in " + t.getName() + " thread...");
    }
}
