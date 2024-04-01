package exp_7; // Package declaration

class UserThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() is invoked in " + t.getName() + " thread..."); 
        for (int i = 1; i <= 10; i++) {
            System.out.println("run: " + i); 
            try {
                Thread.sleep(5000);
            } catch(Exception e) {}
        }
        System.out.println("run() is completed");
    }
}

public class MultiThread {
    public static void main(String arr[]) {
        System.out.println("main() started creating an object of user Thread..."); 
        UserThread t = new UserThread(); 
        System.out.println("Directly invoking run() of user thread"); 
        t.run();
        System.out.println("Control back in main()..."); 
        System.out.println("Launching new thread for run() of user thread..."); 
        t.start();
        for (int i = 10; i > 0; i--) {
            System.out.println("main: " + i); 
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
        System.out.println("main() completed");
    }
}
