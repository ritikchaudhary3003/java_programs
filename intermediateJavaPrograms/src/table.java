import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int N = in.nextInt();
        int sum =0;
        for (int i =1; i<=10; i++){
            sum = N*i;
            System.out.println("The Table is as follow: " + sum + " ");
        }
    }
}
