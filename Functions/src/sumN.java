import java.util.Scanner;

public class sumN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N1= in.nextInt();
        int sum = 0;
        Su(N1,sum);
    }
    private static void Su(int n1, int sum) {
        for(int i=1; i<=n1; i++){
            sum=sum+i;
        }
        System.out.println("The Sum of the numbers is : " + sum);
    }
}
