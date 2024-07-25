
import java.util.Scanner;

public class largestfromuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value

        System.out.println("Enter integers (0 to stop):");

        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
