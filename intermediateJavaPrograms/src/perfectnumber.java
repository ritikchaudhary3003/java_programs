import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        if (num == 0) {
            System.out.println("Invalid Input");
        }
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum==num){
            System.out.println("It is a Perfect Number");
        }else{
            System.out.println("It is not a Perfect Number");
        }
    }
}