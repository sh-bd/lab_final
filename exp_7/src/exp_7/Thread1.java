package exp_7; // Package declaration

import java.lang.*;

public class Thread1 {
    public static void main(String arr[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread is: " + t);
        t.setName("vishal thread");
        System.out.println("After name change thread: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
    }
}
