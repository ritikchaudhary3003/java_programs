import java.util.Scanner;

public class Volumeofcone {
    public static void main(String[] args) {
        double vol;
        double pie = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cone: ");
        double r = input.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double h = input.nextDouble();
        if(h<=0) {
            System.out.println("Invalid Input");
        }else if (r<=0) {
            System.out.println("Invalid Input");
        }else {
            vol = ((double) 1 /3)*pie*(Math.pow(r,2)*h);
            System.out.println("Volume of the cone is : " + vol);

        }

    }

}
