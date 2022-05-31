import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        if (typeOfGroup.equals("Students")) {
            if (day.equals("Friday")){
                price = nrPeople * 8.45;
                if (nrPeople >= 30){
                    price = 0.85 * price;
                }
            } else if (day.equals("Saturday")) {
                price = nrPeople * 9.80;
                if (nrPeople >= 30){
                    price = 0.85 * price;
                }
            } else if (day.equals("Sunday")) {
                price = nrPeople * 10.46;
                if (nrPeople >= 30){
                    price = 0.85 * price;
                }
            }
        } else if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")){
                price = nrPeople * 10.90;
                if ((nrPeople >= 100)){
                    price = (nrPeople - 10) * 10.90;
                }
            } else if (day.equals("Saturday")) {
                price = nrPeople * 15.60;
                if ((nrPeople >= 100)){
                    price = (nrPeople - 10) * 15.60;
                }
            } else if (day.equals("Sunday")) {
                price = nrPeople * 16;
                if ((nrPeople >= 100)){
                    price = (nrPeople - 10) * 16;
                }
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")){
                price = nrPeople * 15;
                if (nrPeople >= 10 && nrPeople <= 20){
                    price = 0.95 * price;
                }
            } else if (day.equals("Saturday")) {
                price = nrPeople * 20;
                if (nrPeople >= 10 && nrPeople <= 20){
                    price = 0.95 * price;
                }
            } else if (day.equals("Sunday")) {
                price = nrPeople * 22.50;
                if (nrPeople >= 10 && nrPeople <= 20){
                    price = 0.95 * price;
                }
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
