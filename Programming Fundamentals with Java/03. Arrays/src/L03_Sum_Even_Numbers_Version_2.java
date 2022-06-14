import java.util.Arrays;
import java.util.Scanner;

public class L03_Sum_Even_Numbers_Version_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (currentNumber % 2 == 0){
                sum += currentNumber;
            }
        }

        System.out.println(sum);
    }
}
