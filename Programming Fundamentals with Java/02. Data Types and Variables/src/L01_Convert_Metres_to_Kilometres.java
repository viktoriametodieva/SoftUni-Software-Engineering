import java.util.Scanner;

public class L01_Convert_Metres_to_Kilometres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = meters * 1.0 / 1000;

        System.out.printf("%.2f", kilometers);
    }
}
