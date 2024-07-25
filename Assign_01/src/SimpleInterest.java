import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        float P = input.nextFloat();
        System.out.print("Enter the Time Period in Years: ");
        float T = input.nextFloat();
        System.out.print("Enter the Interest Rate; ");
        float R = input.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.println("The Simple Interest should be :" + SI);


    }
}
