import java.util.Arrays;
import java.util.Scanner;

public class E08_Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                if(numbers[index] + numbers[i] == number) {
                    System.out.print(numbers[index] + " " + numbers[i]);
                    System.out.println();
                }

            }

        }

    }
}
