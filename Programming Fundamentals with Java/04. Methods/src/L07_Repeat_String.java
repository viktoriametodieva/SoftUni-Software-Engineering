import java.util.Scanner;

public class L07_Repeat_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, count));
    }

    public static String repeatString (String text, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
           result += text;
        }

        return result;
    }
}
