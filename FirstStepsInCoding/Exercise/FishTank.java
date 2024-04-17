package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double sand = Double.parseDouble(scanner.nextLine()) / 100.0;
        double capacity = length * width * height / 1000.0;
        double litres = capacity - capacity * sand;
        System.out.println(litres);
    }
}
