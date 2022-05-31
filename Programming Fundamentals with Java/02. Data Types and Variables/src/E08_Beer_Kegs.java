import java.util.Scanner;

public class E08_Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        String maxModel = "";
        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * Math.pow(radius, 2) * height;
            if (kegVolume > maxValue) {
                maxValue = kegVolume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
