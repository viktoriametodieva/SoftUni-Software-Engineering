import java.util.Scanner;

public class E06_Strong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int initialNumber = number;

        //break number into single digits -> find last digit, use it, remove

        int sumFact = 0;
        while (number > 0){
            int lastDigit = number % 10;
            //find fact (multiply each digit by the number) -> !5 = 1*2*3*4*5
            //add to sumFact
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            number = number / 10;
        }
        if (sumFact == initialNumber) { //INITIAL number is STRONG
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
