import java.util.Scanner;

public class ncr_npr{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = in.nextInt();
        System.out.print("Enter the r : ");
        int r = in.nextInt();
        int fact1 = 1;
        int fact2 = 1;
        int fact3 = 1;
        int nr = n-r;
        for(int i = 1; i<=n; i++){
            fact1 *= i;
        }
        for(int i = 1; i<=r; i++){
            fact2 *= i;

        }
        for(int i = 1; i<=nr; i++){
            fact3 *= i;
        }
            int nCr = fact1/(fact2*fact3);
            int nPr = fact1/fact3;
            System.out.println("The nCr value of the given input is : " + nCr);
            System.out.println("The nPr value for the given input is : " +nPr);

    }
}
