import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S;
        double S1;
        System.out.print("Enter the Marked price of the Product : " );
        double mp= in.nextInt();
        System.out.print("Enter the Discount in percentage on Product : " );
        double dis= in.nextInt();
        dis = dis/100;
        S= mp*dis;
        S1= mp-S;
        System.out.println("The Discounted amount of the Product is : " +S1 );




    }


}
