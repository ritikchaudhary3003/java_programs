import java.util.Scanner;

public class Areaofequilateraltriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the Equilateral Triangle : ");
        int side = in.nextInt();
        if(side<=0) {
            System.out.println("Invalid Input");
        }else{
            double area = (Math.sqrt(3) / 4)*side*side;
            System.out.println("Area of the triangle is " +area);

        }
    }
}
