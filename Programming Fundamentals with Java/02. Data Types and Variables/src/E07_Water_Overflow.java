import java.util.Scanner;

public class E07_Water_Overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //needs fixing

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());

            if(sum <= 255){
                if (sum + litters <= 255) {
                    sum += litters;
                } else {
                    System.out.println("Insufficient capacity!");
                }
            }
        }

        System.out.println(sum);
    }
}
