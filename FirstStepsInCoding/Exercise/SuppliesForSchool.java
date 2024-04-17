package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pens = Double.parseDouble(scanner.nextLine()) * 5.8;
        double markers = Double.parseDouble(scanner.nextLine()) * 7.2;
        double litres = Double.parseDouble(scanner.nextLine()) * 1.2;
        double finalSale = Double.parseDouble(scanner.nextLine()) / 100.0;
        double price = pens + markers + litres - (pens + markers + litres) * finalSale;
        System.out.println(price);
    }
}
