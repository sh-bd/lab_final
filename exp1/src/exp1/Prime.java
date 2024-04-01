package exp1;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int c;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be tested for prime ");
        int n = in.nextInt();
        if (n == 1) {
            System.out.println(n + " is neither prime nor composite.");
        } else {
            for (c = 2; c <= n - 1; c++) {
                if (n % c == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
