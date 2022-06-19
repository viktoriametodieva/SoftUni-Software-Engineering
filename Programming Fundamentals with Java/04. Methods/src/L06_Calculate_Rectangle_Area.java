import java.util.Scanner;

public class L06_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", getRectangleArea(width, length));
    }

    public static double getRectangleArea (double width, double length) {
        return width * length;
    }
}
