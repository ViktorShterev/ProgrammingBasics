package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double priceNoDiscount = area * 7.61;
        double discount = priceNoDiscount * 0.18;
        double finalPrice = priceNoDiscount - discount;
        System.out.printf("The final price is: %f lv.%nThe discount is: %f lv.", finalPrice, discount);
    }
}
