import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        float dep=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Initial Value: ");
        float V1= in.nextFloat();
        System.out.print("Enter the rate of Depreciation: ");
        float R= in.nextFloat();
        System.out.print("Enter the time Period : ");
        float T= in.nextFloat();
        dep = (float)(V1*Math.pow((1-R/100),T));
        System.out.println("The Depreciation Value is : " + dep);


    }
}
