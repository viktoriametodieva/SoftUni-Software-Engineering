import java.util.Scanner;

public class E11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = Byte.parseByte(scanner.nextLine());

        double highestValue = Double.MIN_VALUE;
        int snowBiggest = 0;
        int timeBiggest = 0;
        int qualityBiggest = 0;
        for (int i = 1; i <= n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snow * 1.0 / time), quality);

            if (snowballValue > highestValue) {
                highestValue = snowballValue;
                snowBiggest = snow;
                timeBiggest = time;
                qualityBiggest = quality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowBiggest, timeBiggest, highestValue, qualityBiggest);
    }
}
