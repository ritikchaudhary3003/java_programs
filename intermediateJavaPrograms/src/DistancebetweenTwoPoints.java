import java.util.Scanner;

public class DistancebetweenTwoPoints {
    public static void main(String[] args) {
        int x1,x2;
        int y1,y2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x1 point : ");
        x1 = in.nextInt();
        System.out.println("Enter the x2 point : ");
        x2 = in.nextInt();
        System.out.println("Enter the x2 point : ");
        y1 = in.nextInt();
        System.out.println("Enter the x2 point : ");
        y2 = in.nextInt();
        double dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The Distance between the points is ; " + dis);






    }

}
