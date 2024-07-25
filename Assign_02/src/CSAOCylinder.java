import java.util.Scanner;

public class CSAOCylinder {
    public static void main(String[] args) {
        double pie = 3.14;
        double vol = 0;
        // taking the input from the user and storing the input in the required variables
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: " );
        double r = sc.nextDouble();
        System.out.print("Enter the height of the cylinder; " );
        double h = sc.nextDouble();
        //if conditions to check whether the input is valid or not
        if(r<=0) {
            System.out.println("Invalid Input");

        } else if (h<=0) {
            System.out.println("Invalid Input");


        }else
            vol = 2*pie*h*r;
        System.out.println("The volume of the cylinder is : "+ vol);



    }
}
