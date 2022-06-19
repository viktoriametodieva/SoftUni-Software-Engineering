import java.util.Scanner;

public class L01_Sign_of_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printNumber(number);
    }

    public static void printNumber (int number) {
        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if (number < 0 ){
            System.out.printf("The number %d is negative.", number);
        }else{
            System.out.print("The number 0 is zero.");
        }
    }
}
