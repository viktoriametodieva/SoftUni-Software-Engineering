import java.util.Scanner;

public class L07_Theatre_Promotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        boolean error = false;
        double price = 0;
        if (age >= 0 && age <= 18) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (typeOfDay.equals("Weekday")) {
                price = 18;
            } else if (typeOfDay.equals("Weekend")) {
                price = 20;
            } else if (typeOfDay.equals("Holiday")) {
                price = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 10;
            }
        }else {
            System.out.println("Error!");
            error = true;
        }

        if (!error) {
            System.out.printf("%.0f$", price);
        }

    }
}
