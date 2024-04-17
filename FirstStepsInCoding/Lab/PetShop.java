package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogPack = Double.parseDouble(scanner.nextLine()) * 2.5;
        int catPack = Integer.parseInt(scanner.nextLine()) * 4;
        double priceFood = dogPack + (double)catPack;
        System.out.println(priceFood);
    }
}
