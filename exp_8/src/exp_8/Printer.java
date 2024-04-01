package exp_8;

public class Printer {
	public synchronized void Print(String msg) {
		System.out.println("[");
		try {
			Thread.sleep(5000);
			System.out.println(msg);
			Thread.sleep(5000);
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println("]");
	}
}

class User extends Thread {
	String msg;
	Printer p;

	public User(Printer p, String m) {
		this.p = p;
		msg = m;
	}

	public void run() {
		p.Print(msg);

	}
}

class SynDemo {
	public static void main(String arr[]) {
		System.out.println("creating a pointer.");
		Printer p = new Printer();
		System.out.println("creating two use threads and giving them reference of the printer");
		User u1 = new User(p, "it is user one");
		User u2 = new User(p, "it is user two");
		User u3 = new User(p, "it is user three");
		System.out.println("Starting user threads.");
		u1.start();
		u2.start();
		u3.start();
	}
}
