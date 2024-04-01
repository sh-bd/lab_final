package exp_6;
import java.util.Scanner;
public class Divide2 {
	public static void main(String arr[]) {
		try {
			Scanner obj1 = new Scanner(System.in);
			int a = obj1.nextInt();
			int b = obj1.nextInt();
			if (arr.length < 2)
				throw (new Exception("two argument must be provided"));
			if (b == 0)
				throw (new Exception("second argument should be non zero"));
			int c = a / b;
			System.out.println("result:" + c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
