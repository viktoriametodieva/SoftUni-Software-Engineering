import java.util.Scanner;

public class E10_Poke_Mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); // N
        int distance = Integer.parseInt(scanner.nextLine()); // M
        byte exhaustionFactor = Byte.parseByte(scanner.nextLine()); // Y

        int initialPower = power;
        int timesPoked = 0;
        while (power >= distance){
            timesPoked++;
            power = power - distance;

            if (power == initialPower * 0.5) {
                if (exhaustionFactor > 0) {
                    power = power / exhaustionFactor;
                }
            }
        }

        System.out.println(power);
        System.out.println(timesPoked);
    }
}
