import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        double b, h;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base of the triangle: ");
        b = in.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        h = in.nextDouble();
        double area = 0;
        if (b <= 0) {
            System.out.println("Invalid");

        } else if (h <= 0) {
            System.out.println("Invalid");

        } else area = (0.5 * b * h);
        System.out.println("The area of the triangle is " + area);
    }

    }

