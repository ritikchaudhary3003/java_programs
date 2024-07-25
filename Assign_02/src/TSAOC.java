import java.util.Scanner;

public class TSAOC {
    public static void main(String[] args) {
        double tsa =0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the cube: " );
        int side = in.nextInt();
        if(side<=0) {
            System.out.print("Invalid Input ");

        }else
            tsa = 6*(Math.pow(side,2));
            System.out.println("Total Surface area of cube is " + tsa);




    }
}
