package exp_7;

class PC1 {
    int value;
    boolean produced = false;

    public synchronized void produce(int x) {
        if (produced) {
            System.out.println("Producer entered the monitor out of turn, suspending...");
            try {
                wait();
            } catch (Exception e) {}
        }
        value = x;
        System.out.println(value + " is produced");
        produced = true;
        notify();
    }

    public synchronized void consume() {
        if (!produced) {
            System.out.println("Consumer entered the monitor out of turn, suspending...");
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println(value + " is consumed");
        produced = false;
        notify();
    }
}

class Producer extends Thread {
    PC1 buffer;

    public Producer(PC1 b) {
        buffer = b;
    }

    public void run() {
        System.out.println("Producer started, producing values...");
        for (int i = 1; i <= 10; i++)
            buffer.produce(i);
    }
}

class Consumer extends Thread {
    PC1 buffer;

    public Consumer(PC1 b) {
        buffer = b;
    }

    public void run() {
        System.out.println("Consumer started, consuming values...");
        for (int i = 1; i <= 10; i++)
            buffer.consume();
    }
}

public class PC1 {
    public static void main(String arr[]) {
        PC1 b = new PC1();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}
