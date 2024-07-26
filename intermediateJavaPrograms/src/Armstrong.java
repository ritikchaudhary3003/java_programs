import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;

        for (int i = num; i != 0; i /= 10) {
            int digit = i % 10;
            sum += Math.pow(digit, 3);
        }

        if (sum == temp) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}