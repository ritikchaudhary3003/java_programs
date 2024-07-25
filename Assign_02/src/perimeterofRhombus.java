import java.util.Scanner;

public class perimeterofRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of Rhombus ");
        int S1 = in.nextInt();

        int perimeter = 4 * (S1);
        System.out.println("Perimeter of the Rhombus is " + perimeter);
    }
}