import java.util.Scanner;

public class FibonacciSeries{
    public static int fibRecursion(int N) {
        if (N<=0){
            return 0;
        }
        if(N == 1 || N == 2) {
            return 1;
        }
        return fibRecursion(N-1) + fibRecursion(N-2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: " );
        int fib = in.nextInt();
        System.out.print("Fibonacci Series of " + fib + " numbers is: \n");
        for (int i =0; i<fib; i++){
            System.out.print(fibRecursion(i) + " ");
        }

    }
}