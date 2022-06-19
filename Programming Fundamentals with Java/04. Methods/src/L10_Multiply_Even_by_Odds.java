import java.util.Arrays;
import java.util.Scanner;

public class L10_Multiply_Even_by_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultiplyEvenByOddDigit(number));
    }

    public static int getSumOfEvenDigits (int num) {
        String intToString = Integer.toString(num);
        int[] digits = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        for (int i = 0; i <= digits.length - 1; i++) {
            if (digits[i] % 2 == 0){
                evenSum += digits[i];
            }
        }

        return evenSum;
    }

    public static int getSumOfOddDigits (int num) {
        String intToString = Integer.toString(num);
        int[] digits = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        for (int i = 0; i <= digits.length - 1; i++) {
            if (digits[i] % 2 != 0){
                oddSum += digits[i];
            }
        }

        return oddSum;
    }

    private static int getMultiplyEvenByOddDigit (int num) {
       int even = getSumOfEvenDigits(num);
       int odd = getSumOfOddDigits(num);

        return even * odd;
    }
}
