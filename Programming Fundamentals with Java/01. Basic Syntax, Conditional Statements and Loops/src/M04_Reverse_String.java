import java.util.Scanner;

public class M04_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String reverse = " ";

        for (int i = 0; i <= text.length() - 1; i++) {
           char ch = text.charAt(i);

            reverse = ch + reverse;

        }

        System.out.println(reverse);
    }
}
