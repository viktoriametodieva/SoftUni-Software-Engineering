import java.math.BigDecimal;
import java.util.Scanner;

public class L03_Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < n; i++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNum);
        }

        System.out.println(sum);
    }
}
