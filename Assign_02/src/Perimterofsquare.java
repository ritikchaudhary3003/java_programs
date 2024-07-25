import java.util.Scanner;

public class Perimterofsquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of Square: ");
        int S1 = in.nextInt();

        int perimeter = 4 * (S1);
        System.out.println("Perimeter of the Square is " + perimeter);
    }
}