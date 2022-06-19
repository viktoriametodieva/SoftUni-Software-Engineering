import java.util.Arrays;
import java.util.Scanner;

public class E06_Equal_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= array.length - 1; index++) {
            int currentElement = array[index];
            int rightSum = 0;
            int leftSum = 0;
            
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += array[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= array.length - 1; rightIndex++) {
                rightSum += array[rightIndex];
            }

            if (rightSum == leftSum) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
