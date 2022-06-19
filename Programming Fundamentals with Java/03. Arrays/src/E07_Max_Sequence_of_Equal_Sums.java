import java.util.Arrays;
import java.util.Scanner;

public class E07_Max_Sequence_of_Equal_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
             .mapToInt(e -> Integer.parseInt(e)).toArray();

     int length = 1;
     int maxSequence = 0;

     int startIndex = 0;
     int bestStartIndex = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]){
                length++;
            }else {
                length = 1;
                startIndex = i + 1;
            }

            if (length > maxSequence){
                maxSequence = length;
                bestStartIndex = startIndex;
            }

        }

        for (int i = bestStartIndex; i < bestStartIndex + maxSequence; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}