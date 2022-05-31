import javax.swing.plaf.basic.BasicButtonUI;
import java.util.Scanner;

public class E07_Vending_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumCoins = 0;
        String command = scanner.nextLine();
        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sumCoins = sumCoins + coin;
            } else{
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            command = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            boolean enoughMoney = true;

            if (product.equals("Nuts")) {
                if (sumCoins >= 2){
                    sumCoins = sumCoins - 2;
                }else {
                    System.out.println("Sorry, not enough money");
                    enoughMoney = false;
                }
            } else if (product.equals("Water")) {
                if (sumCoins >= 0.7) {
                    sumCoins = sumCoins - 0.7;
                }else {
                    System.out.println("Sorry, not enough money");
                    enoughMoney = false;
                }
            } else if (product.equals("Crisps")) {
                if (sumCoins >= 1.5) {
                    sumCoins = sumCoins - 1.5;
                }else{
                    System.out.println("Sorry, not enough money");
                    enoughMoney = false;
                }
            } else if (product.equals("Soda")) {
                if (sumCoins >= 0.8) {
                    sumCoins = sumCoins - 0.8;
                }else{
                    System.out.println("Sorry, not enough money");
                    enoughMoney = false;
                }
            } else if (product.equals("Coke")) {
                if (sumCoins >= 1) {
                    sumCoins = sumCoins - 1;
                }else {
                    System.out.println("Sorry, not enough money");
                    enoughMoney = false;
                }
            }else {
                System.out.println("Invalid product");
                enoughMoney = false;
            }


            if (!enoughMoney){
                product = scanner.nextLine();
                continue;
            }

            System.out.printf("Purchased %s%n", product);

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
