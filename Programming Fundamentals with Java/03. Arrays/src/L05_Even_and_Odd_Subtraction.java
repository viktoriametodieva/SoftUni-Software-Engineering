import java.util.Arrays;
import java.util.Scanner;

public class L05_Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int number : array){
            if (number % 2 == 0){
                evenSum = evenSum + number;
            }else{
                oddSum = oddSum + number;
            }
        }

        System.out.println(evenSum - oddSum);

    }
}
