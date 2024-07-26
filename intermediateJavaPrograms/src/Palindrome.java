import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String S1 = in.next();
        String R="";
        char ch;
        for(int i=0; i< S1.length(); i++) {
            ch = S1.charAt(i);
            R = ch+R;
        }
        System.out.println("Reversed string is : " + R);
        if(S1.equals(R)){
            System.out.println("The Entered String is Palindrome :");

        }else{
            System.out.println("The Entered String is not a Palindrome :");
        }



    }
}

