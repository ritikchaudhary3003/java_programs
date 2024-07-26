import java.util.Scanner;
public class evenORodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : " );
        int num = in.nextInt();
        Even(num);
    }
    private static void Even(int n) {
        if(n%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
