import java.util.Scanner;

public class L04_Back_in_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHours = Integer.parseInt(scanner.nextLine());
        int initialMinutes = Integer.parseInt(scanner.nextLine());

        //print time after 30 minutes
        //hh:mm
        //hours -> between 0 and 23; minutes -> between 0 and 59

        int allMinutes = (initialHours * 60) + initialMinutes + 30;

        int hour = allMinutes / 60; //finding hh
        int min = allMinutes % 60; //finding mm

        if (hour >23){
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, min);

    }
}