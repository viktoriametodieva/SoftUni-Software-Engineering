import java.util.Scanner;

public class E02_Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i <= secondArray.length - 1; i++) {
            for (int index = 0; index <= firstArray.length - 1; index++) {
                if (secondArray[i].equals(firstArray[index])){
                    System.out.print(secondArray[i] + " ");
                    break;
                }

            }
        }

    }
}
