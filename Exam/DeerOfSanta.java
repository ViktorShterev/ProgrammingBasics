package Exam;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayMissing = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodFirst = Double.parseDouble(scanner.nextLine());
        double foodSecond = Double.parseDouble(scanner.nextLine());
        double foodThird = Double.parseDouble(scanner.nextLine());
        double total = dayMissing * foodFirst + dayMissing * foodSecond + dayMissing * foodThird;
        if (total <= foodLeft){
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft - total));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(total - foodLeft));
        }
    }
}
