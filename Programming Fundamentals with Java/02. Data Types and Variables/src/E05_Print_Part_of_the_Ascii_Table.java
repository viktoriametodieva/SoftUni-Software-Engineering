import java.util.Scanner;

public class E05_Print_Part_of_the_Ascii_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indexOne = Integer.parseInt(scanner.nextLine());
        int indexTwo = Integer.parseInt(scanner.nextLine());

        for (int i = indexOne; i <= indexTwo; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
