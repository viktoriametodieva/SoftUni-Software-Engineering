import java.text.NumberFormat;
import java.util.Scanner;

public class M03_Gaming_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        double gamePrice = 0;
        double totalSpent = 0;
        String command = scanner.nextLine();
        while(!command.equals("Game Time")){
            String game = command;

            boolean isValid = true;
            switch (game){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                default:
                    isValid = false;
                    System.out.println("Not Found");
                    break;
            }

            if(isValid && currentBalance >= gamePrice){
                currentBalance -= gamePrice;
                totalSpent += gamePrice;
                System.out.printf("Bought %s%n", game);
            }else if (currentBalance < gamePrice){
                System.out.println("Too Expensive");
            }
            if (currentBalance == 0){
                System.out.println("Out of money!");
                return;
            }


            command = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
    }
}
