import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N ;
        int sum =0;
        int avg=0;
        int count=0;
        while(true){
            System.out.println("Enter the numbers from 1-9 and press 0 to end  :" );
            N=in.nextInt();
            if (N==0) {
                break;
            }
            sum += N;
            while(N!=0){
                N=N/10;
                count++;
            }
            avg = sum/count;


        }System.out.println("The Average of your Entered Digits is : " + avg);


        }
    }



