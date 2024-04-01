package exp_6;
import java.util.Scanner;
public class Divide3 {
	public static int divide(int x, int y) {
		int z = 0;
		try {
			try {
				z = x / y;
			} finally {
			}
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}
		return z;
	}
	public static void main(String arr[]) {
		try {
			Scanner obj = new Scanner(System.in);
			int a = obj.nextInt();
			int b = obj.nextInt();
			int c = divide(a, b);
			System.out.println("Result is=" + c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
