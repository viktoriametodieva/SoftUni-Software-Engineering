import java.util.Scanner;

public class L11_Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theInteger = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        int product = theInteger;
        if (multiplier <= 10){
            for (int i = multiplier; i <= 10; i++) {
                //{theInteger} X {times} = {product}
                product = theInteger * i;
                System.out.printf("%d X %d = %d%n", theInteger, i, product);
            }
        } else {
            product = theInteger * multiplier;
            System.out.printf("%d X %d = %d%n", theInteger, multiplier,product);
        }

    }
}
