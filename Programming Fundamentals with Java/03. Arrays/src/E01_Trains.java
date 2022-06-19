import java.util.Scanner;

public class E01_Trains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arrayNrPeople = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            arrayNrPeople[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        for (int i = 0; i <= arrayNrPeople.length - 1; i++) {
            sum = sum + arrayNrPeople[i];
            System.out.print(arrayNrPeople[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
