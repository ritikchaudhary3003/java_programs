import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int Nsub= in.nextInt();
        int [] marks = new int[Nsub];
        int [] maxmarks = new int[Nsub];

        for(int i = 0; i<Nsub; i++) {
            System.out.print("Enter the marks of subject " + (i+1) + ": ");
            marks[i] = in.nextInt();

            System.out.print("Enter the maximum marks of subject " + (i+1) + ": ");
            maxmarks[i] = in.nextInt();
        }
        int totalMarks = 0;
        int totalMaxMarks = 0;

        for(int i = 0; i < Nsub; i++){
            totalMarks += marks[i];
            totalMaxMarks += maxmarks[i];
        }
        double percentage = (totalMarks / (double) totalMaxMarks) *100;
        double cgpa = percentage/9.5;
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("CGPA: %.2f%n", cgpa);




    }
}
