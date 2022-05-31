import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        //password -> reversed username

        String password = "";
        //start at the last position then move one forward and so on
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        int counter = 0;
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {

            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}