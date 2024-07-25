import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        int b,h;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base of the rectangle: ");
        b = in.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        h = in.nextInt();
        double area = 0;
        if (b <= 0) {
            System.out.println("Invalid");

        } else if (h <= 0) {
            System.out.println("Invalid");

        } else area = (b * h);
        System.out.println("The area of the rectangle is " + area);
    }
}
