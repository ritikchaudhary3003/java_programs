import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number :" );
        int N1 = in.nextInt();
        System.out.println("Enter the second number :" );
        int N2 = in.nextInt();
        Sum(N1,N2);
    }

    private static void Sum(int n1, int n2) {
        int Plus = n1+n2;
        System.out.println("The Sum of your Entered Numbers is :" + Plus);
    }
}
