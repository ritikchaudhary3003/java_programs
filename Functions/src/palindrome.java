import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = a.nextLine();
        char ch;
        String reverse="";
        for(int i = 0; i<str.length() ; i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }

        if(str.equals(reverse)){
            System.out.println(str+" is palindrome");
        } else{
            System.out.println(str+" is not palindrome");
        }
    }
}
