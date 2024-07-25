import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        num1= input.nextInt();
        System.out.print("Enter the second Number: ");
        num2= input.nextInt();
        if(num1>num2) {
            System.out.println(num1 +" is largest");
        }else {
            System.out.println(num2 +" is largest");
        }


    }
}
