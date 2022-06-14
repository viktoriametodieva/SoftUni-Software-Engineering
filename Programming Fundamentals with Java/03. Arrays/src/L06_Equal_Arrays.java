import java.util.Arrays;
import java.util.Scanner;

public class L06_Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isNotIdentical = false;
        for (int i = 0; i <= firstArray.length -1; i++) {
            sum = sum + firstArray[i];
            if (firstArray[i] != secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isNotIdentical = true;
                break;
            }
        }

        if (!isNotIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
