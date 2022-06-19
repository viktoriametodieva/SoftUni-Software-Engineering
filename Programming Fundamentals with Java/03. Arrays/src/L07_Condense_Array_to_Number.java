import java.util.Arrays;
import java.util.Scanner;

public class L07_Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNum = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        while (arrayNum.length > 1){
            int [] condensedArray = new int[arrayNum.length - 1];
            for (int index = 0; index < arrayNum.length - 1; index++) {
                condensedArray[index] = arrayNum[index] + arrayNum[index + 1];
            }
            arrayNum = condensedArray.clone();
        }

        System.out.println(arrayNum[0]);

    }
}
