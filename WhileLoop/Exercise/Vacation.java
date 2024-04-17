package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int daySpending = 0;
        while (money < moneyNeeded && daySpending < 5){
            String move = scanner.nextLine();
            double transaction = Double.parseDouble(scanner.nextLine());
            days++;
            if (move.equals("spend")){
                money -= transaction;
                daySpending += 1;
                if (money < 0){
                    money = 0;
                }
            } else {
                money += transaction;
                daySpending = 0;
            }
        }
        if (daySpending == 5){
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (money >= moneyNeeded){
            System.out.printf("You saved the money for %d days.", days);

        }
    }
}
