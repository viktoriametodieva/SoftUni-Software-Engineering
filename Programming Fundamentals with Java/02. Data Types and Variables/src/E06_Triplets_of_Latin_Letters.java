import java.util.Scanner;

public class E06_Triplets_of_Latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char letterOne = 'a'; letterOne < 'a' + n; letterOne++) {
            for (char letterTwo = 'a'; letterTwo < 'a' + n; letterTwo++) {
                for (char letterThree = 'a'; letterThree < 'a' + n; letterThree++) {
                    System.out.printf("%c%c%c%n", letterOne, letterTwo, letterThree);
                }

            }

        }
    }
}
