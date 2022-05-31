import java.util.Scanner;

public class E08_Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= number ; row++) {
            for (int colum = 1; colum <= row; colum++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
