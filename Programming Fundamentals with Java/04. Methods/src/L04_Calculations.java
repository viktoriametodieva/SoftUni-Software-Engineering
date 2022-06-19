import java.util.Scanner;

public class L04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (action){
            case "add":
                printAddNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                printMultiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                printSubtractNumbers(firstNumber, secondNumber);
                break;
            case "divide":
                printDivideNumbers(firstNumber, secondNumber);
                break;
        }

    }

    public static void printAddNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    public static void printMultiplyNumbers (int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }

    public static void printSubtractNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }

    public static void printDivideNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        System.out.println(result);
    }

}
