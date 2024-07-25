import java.util.Scanner;

public class AreaofIsoscelesTriangle {
    public static void main(String[] args) {

        double area = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the triangle :");
        int height = in.nextInt();
        System.out.print("Enter the base of the triangle :");
        int base = in.nextInt();
        System.out.print("Enter the other side of the triangle :");
        int ots = in.nextInt();
        while (true) {
            System.out.println("Choose a formula to calculate the area of the triangle");
            System.out.println("1. Area using height and base only");
            System.out.println("2. Area using height base and side");
            System.out.println("3. Exiting..");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    area = (base * height)/2;
                    System.out.println("Area using 1 Choice: " + area);
                    break;
                case 2:
                    int s = (ots + ots + base) /2;
                    area = Math.sqrt(s * (s - ots) * (s - ots) * (s - base));
                    System.out.println("Area using 2 Choice: " + area);
                    break;
                case 3:
                    System.out.println("Exiting..");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }


        }




    }


