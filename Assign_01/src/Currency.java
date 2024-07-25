import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double con,rup,dol;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees: ");
        rup = input.nextInt();
        dol = 83.69;
        con = rup/dol;
        System.out.println(rup+ " rupees in dollar is "+con);



    }
}
