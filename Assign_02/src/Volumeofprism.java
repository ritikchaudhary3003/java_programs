import java.util.Scanner;

public class Volumeofprism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the prism: ");
        int B= in.nextInt();
        System.out.print("Enter the height of the prism: ");
        int h= in.nextInt();
        int vol=0;
        if(B<=0) {
            System.out.println("Invalid Input");

        } else if (h<=0) {
            System.out.println("Invalid Input");
        }else
            vol = B*h;
            System.out.println("The volume of the cone is : " + vol);


    }
}
