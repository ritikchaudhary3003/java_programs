import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers and press 0 to exit ");
        int snn=0;
        int spe=0;
        int sne=0;
        int num;
        while(true){
            num = in.nextInt();
            if(num==0){
                break;
            }
            if(num<0){
                snn=snn+num;
            }else if (num%2==0) {
                spe=spe+num;
            }else{
                sne=sne+num;
            }


        }
        System.out.println("Sum of negative numbers is " + snn);
        System.out.println("Sum of positive even numbers is " + spe);
        System.out.println("Sum of positive odd numbers is " + sne);
    }

}
