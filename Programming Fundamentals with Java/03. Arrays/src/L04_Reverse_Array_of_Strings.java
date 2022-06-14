import java.util.Scanner;

public class L04_Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for (int index = 0; index < array.length / 2; index++) {
            String currentIndex = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = currentIndex;
        }

        System.out.println(String.join(" ", array));
    }
}
