import java.util.Scanner;

public class FInvestmentV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Present Value : " );
        double p = in.nextDouble();
        System.out.print("Enter the annual interest rate :" );
        double r = in.nextDouble();
        System.out.print("Enter the time period in years : " );
        int t = in.nextInt();
        if(p==0||r==0||t==0){
            System.out.print("Invalid Input");

        }else{
            double f=p*Math.pow(1+r,t);
            System.out.println("Future value of the investment; " + f);

        }
    }
}
