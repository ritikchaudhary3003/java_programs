import java.util.Scanner;
public class largestof3{
    private static void Minimum(int n1, int n2, int n3) {
        if(n1<n2){
            if(n1<n3){
                System.out.println("First Number is smallest");
            }
            else{
                System.out.println("Third Number is smallest");
            }
        }
        else{
            System.out.println("Second Number is smallest");
        }
    }

    private static void Maximum(int n1, int n2, int n3) {
        if(n1>n2){
            if(n1>n3){
                System.out.println("First Number is Maximum");
            }
            else{
                System.out.println("Third Number is Maximum");
            }
        }
        else{
            System.out.println("Second number is Maximum");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int N1=in.nextInt();
        System.out.println("Enter the Second Number: ");
        int N2=in.nextInt();
        System.out.println("Enter the Third Number: ");
        int N3=in.nextInt();
        Minimum(N1,N2,N3);
        Maximum(N1,N2,N3);
    }
}
