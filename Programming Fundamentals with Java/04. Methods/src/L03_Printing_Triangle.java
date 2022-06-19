import java.util.Scanner;

public class L03_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTriangle(number);

    }

    public static void printTriangle (Integer n) {
        for (int i = 1; i <= n; i++) {
            printLine(i);
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            printLine(i);
            System.out.println();
        }

    }

    public static void printLine (Integer n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
