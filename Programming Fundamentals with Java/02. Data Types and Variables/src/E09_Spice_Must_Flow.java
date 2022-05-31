import java.util.Scanner;

public class E09_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int spiesStorage = 0;
        int days = 0;
        while (startingYield >= 100) {
            days++;
            spiesStorage += startingYield - 26;
            startingYield -= 10;
        }

        if (spiesStorage >= 26){
        spiesStorage= spiesStorage - 26;
        }else{
            spiesStorage = 0;
        }

        System.out.println(days);
        System.out.println(spiesStorage);
    }
}
