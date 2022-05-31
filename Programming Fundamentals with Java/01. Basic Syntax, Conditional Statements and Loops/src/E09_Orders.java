import java.util.Scanner;

public class E09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //((daysInMonth * capsulesCount) * pricePerCapsule)

        int countOrders = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0; //all orders summed
        for (int i = 1; i <= countOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            double orderPrice = (days * countCapsules) * pricePerCapsule;
            totalPrice = totalPrice + orderPrice;

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }
        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}
