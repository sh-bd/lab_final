package exp_6;
import java.util.Scanner;
public class CustomTest {
	public static void main(String arr[]) {
		try {
			Scanner obj = new Scanner(System.in);
			int a = obj.nextInt();
			if (a < 10 || a > 50)
				throw (new Exception("valid range is 10 to 50"));
			{
				int s = a * a;
				System.out.println("Square is:" + s);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
