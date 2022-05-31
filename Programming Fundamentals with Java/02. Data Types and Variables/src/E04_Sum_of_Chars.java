import java.util.Scanner;

public class E04_Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        for (int i = 1; i <= n ; i++) {
            char letter = scanner.nextLine().charAt(0);
            int asciiCode = (char)letter;

            totalSum = totalSum + asciiCode;
        }

        System.out.printf("The sum equals: %d", totalSum);
    }
}
