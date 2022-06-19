import java.util.Arrays;
import java.util.Scanner;

public class E05_Top_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= array.length - 1; index++) {
            int currentElement = array[index];

            if (index == array.length - 1){
                System.out.println(currentElement);
                break;
            }

            boolean isTop = false;
            for (int i = index + 1; i <= array.length - 1; i++) {
                int nextElement = array[i];

                if (currentElement > nextElement){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }
            }

            if (isTop){
                System.out.print(currentElement + " ");
            }

        }
    }
}
