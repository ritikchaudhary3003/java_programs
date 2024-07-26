import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pie = 3.14;
        System.out.println("Enter the Radius of the circle: ");
        double R = in.nextDouble();
        circum(R,pie);
        area(R,pie);
    }
    private static void circum(double r, double p) {
        double C=2*p*r;
        System.out.println("Circumference of the circle is : " + C);
    }
    private static void area(double r, double p) {
        double A=2*p*Math.pow(r,2);
        System.out.println("Area of the Circle is : " + A );
    }
}