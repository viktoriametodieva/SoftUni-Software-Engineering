import java.util.Scanner;

public class L10_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //{theInteger} X {times} = {product}
        int theInteger = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {

            int product = theInteger * i;
            System.out.printf("%d X %d = %d%n", theInteger,i, product);
        }

    }
}
