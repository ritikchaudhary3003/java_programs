import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N = in.nextInt();
        prime(N);
    }
    private static void prime(int n) {
        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }System.out.println(n + " is a prime number");
    }
}

