package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double plastic = Double.parseDouble(scanner.nextLine()) * 1.5;
        double paint = Double.parseDouble(scanner.nextLine()) * 14.5;
        double thinner = Double.parseDouble(scanner.nextLine()) * 5.0;
        double hours = Double.parseDouble(scanner.nextLine());
        double paintFinal = paint + (paint * 1.1 - paint);
        double plasticFinal = plastic + 3.0;
        double bag = 0.4;
        double workers = (paintFinal + plasticFinal + bag + thinner) * 0.3 * hours;
        double sum = workers + paintFinal + plasticFinal + bag + thinner;
        System.out.println(sum);
    }
}
