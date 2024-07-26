import java.util.Scanner;

public class ProDuct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number: " );
        int N1=in.nextInt();
        System.out.println("Enter the Second Number: " );
        int N2=in.nextInt();
        Pro(N1,N2);
    }

    private static void Pro(int n1, int n2) {
        int pro=n1*n2;
        System.out.println("The Product of your entered numbers is : " +pro );

    }
}
