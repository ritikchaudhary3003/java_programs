import java.util.Scanner;

public class factors_of_the_number {
    public static void main(String[] args) {
        int num,i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: " );
        num = in.nextInt();
        for(i=1;i<=num;i++) {
            if (num % i == 0)
                System.out.println("Factors are : " + i);

        }


    }
}
