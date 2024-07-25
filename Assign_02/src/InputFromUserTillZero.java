import java.util.Scanner;

public class InputFromUserTillZero {
    public static void main(String[] args) {
        System.out.print("Enter the numbers and enter 0 to Exit ");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;
        while (true){
            num = in.nextInt();
            if (num==0){
                break;
            }
            sum = sum + num;

        }System.out.println("The sum of entered digits is equal to : " + sum);
    }

}
