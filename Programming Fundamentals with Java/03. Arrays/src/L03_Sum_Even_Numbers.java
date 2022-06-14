import java.util.Scanner;

public class L03_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int[] numArray = new int[array.length];

        for (int i = 0; i < numArray.length; i++) {
           numArray[i] = Integer.parseInt(array[i]);
        }

        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            int currentNumber = numArray[i];

            if (currentNumber % 2 == 0){
                sum += currentNumber;
            }

        }

        System.out.println(sum);
    }
}
