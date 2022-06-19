import java.util.Arrays;
import java.util.Scanner;

public class E09_Array_Modifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while(!input.equals("end")){
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            if (command.equals("swap")){
                int firstIndex = Integer.parseInt(commandParts[1]);
                int secondIndex = Integer.parseInt(commandParts[2]);

               int elementOne = numbersArray[firstIndex];
               int elementTwo = numbersArray[secondIndex];
               numbersArray[firstIndex] = elementTwo;
               numbersArray[secondIndex] = elementOne;

            }else if (command.equals("multiply")) {
                int firstIndex = Integer.parseInt(commandParts[1]);
                int secondIndex = Integer.parseInt(commandParts[2]);
                numbersArray[firstIndex] = numbersArray[firstIndex] * numbersArray[secondIndex];

            } else if (command.equals("decrease")) {
                for (int i = 0; i <= numbersArray.length - 1; i++) {
                    numbersArray[i] = numbersArray[i] - 1;

                }

            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= numbersArray.length - 1; i++) {
            if(i != numbersArray.length - 1){
                System.out.print(numbersArray[i] + ", ");
            }else {
                System.out.print(numbersArray[i]);
            }

        }

    }
}
