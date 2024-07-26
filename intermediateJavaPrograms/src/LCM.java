import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        int hcf=0;
        int lcm=0;
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
            hcf=a;
            lcm= a*b/hcf;
            System.out.println("The LCM of the two numbers is " + lcm);
            System.out.println("HCF of the two numbers is " + hcf);
        }
    }
}