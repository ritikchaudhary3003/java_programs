import java.util.Scanner;

public class Eligibleforvote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: " );
        int age = in.nextInt();
        Eligible(age);
    }

    private static void Eligible(int a) {
        if(a>=18){
            System.out.println("You Are Eligible");
        }
        else{
            System.out.println("You Are a Minor");
        }
    }
}
