import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your Marks out of 100: " );
        int marks = in.nextInt();
        grade(marks);
    }

    private static void grade(int m) {
        if (m>100) {
            System.out.println("Invalid Input");
        } else if (m>90) {
            System.out.println("AA");
        } else if (m>80) {
            System.out.println("AB");
        } else if (m>70) {
            System.out.println("BB");
        } else if (m>60) {
            System.out.println("BC");
        } else if (m>50) {
            System.out.println("CD");
        } else if (m>40) {
            System.out.println("DD");
        } else if (m<40) {
            System.out.println("Fail");
        }
    }
}
