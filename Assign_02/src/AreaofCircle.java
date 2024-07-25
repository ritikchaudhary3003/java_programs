import java.util.*;
public class AreaofCircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = in.nextDouble();
        double pie = 3.14;
        double area = 0;
        if(radius<=0) {
            System.out.println("Area cannot be calculated");

        }else {
            area = pie*(Math.pow(radius,2));
            System.out.println("Area of the circle with the given radius : " + radius + " is " + area );
        }





    }
}