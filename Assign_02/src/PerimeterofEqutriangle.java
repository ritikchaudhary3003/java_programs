import java.util.Scanner;

public class PerimeterofEqutriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the triangle:");
        int side = in.nextInt();
        if(side<=0) {
            System.out.println("Invalid Input");
        }else{
            int per = 3 * side;
            System.out.println("Perimeter of the triangle is " +per);
        }
    }
}
