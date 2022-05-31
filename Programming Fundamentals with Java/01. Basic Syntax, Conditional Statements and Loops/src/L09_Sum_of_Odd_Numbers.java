import java.util.Scanner;

public class L09_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 != 0){
                counter += i;
                System.out.println(i);
            }
        }
        System.out.printf("Sum: %d", counter);
    }
}
