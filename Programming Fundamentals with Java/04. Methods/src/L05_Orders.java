import java.util.Scanner;

public class L05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

       printPrice(product, quantity);

    }

    public static void printPrice(String product, int quantity){
        double productPrice = 0;
        switch (product){
            case "coffee":
                productPrice = quantity * 1.50;
                break;
            case "water":
                productPrice = quantity * 1.0;
                break;
            case "coke":
                productPrice = quantity * 1.40;
                break;
            case "snacks":
                productPrice = quantity * 2.0;
                break;
        }

        System.out.printf("%.2f", productPrice);
    }
}
