import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number for factorial : " );
        int f = in.nextInt();
        int facto=1;
        fact(f,facto);
    }
    private static void fact(int f,int ff) {
        for(int i =1; i<=f; i++){
            ff = ff*i;
        }
        System.out.println("Factorial is :"+ff);
    }
}
