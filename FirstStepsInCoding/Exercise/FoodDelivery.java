package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chicken = Double.parseDouble(scanner.nextLine()) * 10.35;
        double fish = Double.parseDouble(scanner.nextLine()) * 12.4;
        double vegetarian = Double.parseDouble(scanner.nextLine()) * 8.15;
        double dessert = (chicken + fish + vegetarian) * 0.2;
        double delivery = 2.5;
        double sum = chicken + fish + vegetarian + dessert + delivery;
        System.out.println(sum);
    }
}
