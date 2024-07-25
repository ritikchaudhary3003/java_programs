import java.util.Scanner;

public class Perimeter_of_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of Parallelogram :");
        int S1 = in.nextInt();
        System.out.print("Enter the other side of Parallelogram :");
        int S2 = in.nextInt();
        int perimeter = 2*(S1+S2);
        System.out.println("Perimeter of the parallelogram is "+ perimeter);

    }
}
