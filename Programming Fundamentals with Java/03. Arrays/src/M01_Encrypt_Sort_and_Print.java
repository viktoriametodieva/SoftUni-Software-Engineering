import java.util.Arrays;
import java.util.Scanner;

public class M01_Encrypt_Sort_and_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] sequence = new String[n];

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = (scanner.nextLine());
        }

        int[] sequenceLength = new int[n];

        for (int i = 0; i < sequence.length; i++) {
            String currentSequence = sequence[i];
            int asciiValueResult = 0;
            for (int position = 0; position < currentSequence.length(); position++) {
                char currentPosition = currentSequence.charAt(position);
                int asciiValue = (int) currentPosition;

                boolean isVowel = false;
                switch (currentPosition){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        isVowel = true;
                        break;
                }

                if (isVowel){
                    asciiValueResult += asciiValue * currentSequence.length();
                }else{
                    asciiValueResult += asciiValue / currentSequence.length();
                }

            }

            sequenceLength[i] = asciiValueResult;
        }

        Arrays.sort(sequenceLength);
        for (int element : sequenceLength){
            System.out.println(element);
        }
    }
}

