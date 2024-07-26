import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int fac = in.nextInt();
        int i;
        int res = 1;
        for (i = 1; i <= fac; i++) {
            res = res * i;
        }
        System.out.print("Factorial of the above number is " + res );
    }

}