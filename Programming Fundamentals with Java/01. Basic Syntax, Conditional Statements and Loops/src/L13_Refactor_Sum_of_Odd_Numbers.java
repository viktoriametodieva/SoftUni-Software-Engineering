import java.util.Scanner;

public class L13_Refactor_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= n * 2; i+= 2) {
            sum += i;
            System.out.println (i);
        }

        System.out.printf("Sum: %d", sum);

    }
}
