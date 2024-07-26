import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        int bill = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of Units:");
        int unit = in.nextInt();
        if (unit <= 100){
            bill = unit*10;
            System.out.print("Your Electricity bill is " + bill);
        }else if (unit <= 200){
            bill = (100 * 10) + (unit - 100) * 15;
        }else if (unit<=300) {
            bill = (100 * 10) + (100 * 15) + (unit - 200)*20;
        }else if (unit>300){
            bill = (100 * 10) + (100 * 15) + (100*20) + (unit-300)*25;
        }
        System.out.print("Your Electricity Bill is " + bill);




    }
}
