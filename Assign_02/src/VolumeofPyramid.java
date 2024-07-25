import java.util.Scanner;

public class VolumeofPyramid {
    public static void main(String[] args) {
        double vol = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid: ");
        double l = in.nextDouble();
        System.out.print("Enter the width of the pyramid: ");
        double w = in.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double h = in.nextDouble();
        if (l <= 0 && w <= 0 && h <= 0) {
            System.out.println("Invalid Input");

        } else {
            vol = (l * w * h) / 3;
            System.out.println("The volume of the Pyramid is " + vol);


        }

    }
}

