import java.util.*;
public class Perimetre_of_circle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = in.nextDouble();
        double pie = 3.14;
        double per = 0;
        if (radius <= 0) {
            System.out.println("Perimetre cannot be calculated");

        } else {
            per = 2 * pie * radius;
            System.out.println("Perimeter of the circle with the given radius : " + radius + " is " + per);
        }
    }
}