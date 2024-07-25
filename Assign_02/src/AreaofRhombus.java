import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        int d1,d2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diagonal 1 of the Rhombus: ");
        d1 = in.nextInt();
        System.out.print("Enter the diagonal 2 of the Rhombus: ");
        d2 = in.nextInt();
        double area = 0;
        if (d1 <= 0) {
            System.out.println("Invalid");

        } else if (d2 <= 0) {
            System.out.println("Invalid");

        } else area = (0.5* d1 * d2);
        System.out.println("The area of the Rhombus is " + area);
    }
}