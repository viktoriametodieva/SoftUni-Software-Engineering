import java.util.Scanner;

public class E11_Rage_Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double rageExpenses = 0;
            for (int i = 1; i <= lostGameCount; i++) {
                if (i % 2 == 0) {
                    rageExpenses = rageExpenses + headsetPrice;
                }
                if (i % 3 == 0) {
                    rageExpenses = rageExpenses + mousePrice;
                }
                if (i % 6 == 0) {
                    rageExpenses = rageExpenses + keyboardPrice;
                }
                if (i % 12 == 0) {
                    rageExpenses = rageExpenses + displayPrice;
                }
            }
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
