import java.util.Scanner;

public class SumNno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total numbers you want to sum : ");
        int N= in.nextInt();
        int sum = 0;
        for(int i=1;i<=N;i++) {
            System.out.print("Enter the Numbers " + i + ": ");
            int num = in.nextInt();

            sum = sum + num;
        }
        System.out.println("The sum is equal to : " + sum);
    }
}
