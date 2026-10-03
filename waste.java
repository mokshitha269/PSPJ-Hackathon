import java.util.*;

public class waste {
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle number");
        int n = sc.nextInt();

        System.out.println("Enter waste collected in kilogram");
        double w = sc.nextDouble();

        System.out.println("Enter number of collection points");
        int points = sc.nextInt();

        System.out.println("Enter vehicle status");
        char status = sc.next().charAt(0);

        System.out.println("Enter the waste collected at point 1 and 2");
        double point1Waste = sc.nextDouble();
        double point2Waste = sc.nextDouble();

        System.out.println("The vehicle number is: " + n + "\n"
                + "The total waste collected: " + w + "kg" + "\n"
                + "The total collection points is: " + points + "\n"
                + "The status of the vehicle is: " + status);

        if (w >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste at points 1 and 2: " + totalWaste + "kg");
    }
}