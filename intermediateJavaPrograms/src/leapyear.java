import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = in.nextInt();
        if((year%400==0)||(year%100!=0)&&(year%4==0)){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}
