import java.util.Scanner;

public class SubandSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int num = in.nextInt();
        int sum = 0;
        int pro = 1;
        int temp = num;
        int count = 0;
        //Count the number of digits in number
        while(temp != 0 ){       // while loop told us how many digits are there
            temp=temp/10;        // e.g. 6754 = 4 digits
            count++;
        }
        for (int i = 0; i<count; i++){
            int digit = num % 10;    // this will tell what are the numbers e.g. 6,7,5,4
            sum=sum+digit;
            pro=pro*digit;
            num=num/10;
        }
        int result = pro - sum;
        System.out.println("The Subtracted value is : " + result);





    }
}
