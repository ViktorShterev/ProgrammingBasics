package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax = Double.parseDouble(scanner.nextLine());
        double sneaker = tax - tax * 0.4;
        double shirt = sneaker - sneaker * 0.2;
        double ball = shirt * 0.25;
        double accessories = ball * 0.2;
        double sum = tax + sneaker + shirt + ball + accessories;
        System.out.println(sum);
    }
}
