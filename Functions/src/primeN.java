import java.util.Scanner;

public class primeN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag=0;
        int i=0;
        int j=0;
        System.out.println("Enter the first number: ");
        int N1=in.nextInt();
        System.out.println("Enter the Second number: ");
        int N2=in.nextInt();
        prim(N1,N2,flag,i,j);
        System.out.printf("\nPrime numbers between %d and %d ", N1, N2);
    }
    private static void prim(int n1, int n2, int flag, int i, int j) {
        for(i=n1; i<=n2; i++){
            if(i==0||i==1){
                continue;
            }
            flag=1;
            for(j=2; j<=i/2; ++j){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1) {
                System.out.println(i);
            }
        }
    }
}
