import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        System.out.print("Enter the first number : " );
        int a = in.nextInt();
        System.out.print("Enter the Second number : ");
        int b = in.nextInt();
        if(a==0||b==0){
            System.out.print("Invalid Input");

        }else{
            temp=b;
            b=a%b;
            a=temp;
            System.out.print("HCF of the two numbers is " + a);
        }

    }

}
