import java.util.Scanner;

public class L07_Reversed_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        char three = scanner.nextLine().charAt(0);

        System.out.println(three + " " + two + " " + one);
    }
}
