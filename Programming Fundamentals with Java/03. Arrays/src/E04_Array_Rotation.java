import java.util.Arrays;
import java.util.Scanner;

public class E04_Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int nrRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= nrRotations; rotation++) {
            int firstElement = array[0];

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }

            array[array.length - 1] = firstElement;
        }

        for (int element : array){
            System.out.print(element + " ");
        }
    }
}
