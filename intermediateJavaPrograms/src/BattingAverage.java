import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double avg ;
        System.out.println("Enter the runs scored by the batsman : ");
        int Runs= in.nextInt();
        System.out.println("Enter the total innings played by batsman :  ");
        int inn= in.nextInt();
        System.out.println("Enter the innings of NOTOUTS : ");
        int no= in.nextInt();
        avg = Runs/(inn-no);
        System.out.println("The batting Average of the Batsman is : " + avg);

    }
}
