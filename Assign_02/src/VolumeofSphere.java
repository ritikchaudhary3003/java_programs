import java.util.Scanner;

public class VolumeofSphere {
    public static void main(String[] args) {
        double pie = 3.14;
        double vol = 0;
        // taking the input from the user and storing the input in the required variables
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: " );
        double r = sc.nextDouble();

        //if conditions to check whether the input is valid or not
        if(r<=0) {
            System.out.println("Invalid Input");

        }else
            vol = (double)4/3*pie*(Math.pow(r,3));
        System.out.println("The volume of the cylinder is : "+ vol);



    }
}
