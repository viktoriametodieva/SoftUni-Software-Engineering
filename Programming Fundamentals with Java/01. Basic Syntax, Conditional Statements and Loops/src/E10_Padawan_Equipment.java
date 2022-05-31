import java.util.Scanner;

public class E10_Padawan_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int nrOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int countNrFreeBelts = 0;
        for (int i = 1; i <= nrOfStudents ; i++) {
            if (i % 6 == 0) {
                countNrFreeBelts++;
            }
        }

        double moneyNeeded = (lightsaberPrice * Math.ceil(1.1 * nrOfStudents))
                + (robePrice * nrOfStudents)
                + (beltPrice * (nrOfStudents - countNrFreeBelts));

        if (moneyAvailable >= moneyNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        }  else{
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(moneyAvailable-moneyNeeded));
        }

    }
}
