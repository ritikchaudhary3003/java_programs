import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit up to which you want to find Pythagorean triplets: ");
        int limit = in.nextInt();
        findPythagoreanTriplets(limit);
    }

    public static void findPythagoreanTriplets(int limit) {
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) { // Start b from a to avoid duplicate pairs
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c * c == cSquared && c <= limit) { // Check if c is a whole number and within limit
                    System.out.println("Pythagorean Triplet: " + a + ", " + b + ", " + c);
                }
            }
        }
    }
}
