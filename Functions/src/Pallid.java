import java.util.Scanner;

public class Pallid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int S1 = in.nextInt();
        String A1 = Integer.toString(S1);
        String R = "";
        char ch=0;
        palidd(A1, R, ch);

    }

    private static void palidd(String a1, String r, char ch) {
        for (int i = 0; i < a1.length(); i++) {
            ch = a1.charAt(i);
            r = ch + r;
        }
        System.out.println("Reversed number is : " + r);
        if (a1.equals(r)) {
            System.out.println("The Entered Number is Palindrome ");

        } else {
            System.out.println("The Entered Number is not a Palindrome :");
        }
    }
}



