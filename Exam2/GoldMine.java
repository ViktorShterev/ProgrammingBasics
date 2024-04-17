package Exam2;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int places = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= places; i++) {
            double average = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double gold = 0;
            double averageGold = 0;
            for (int j = 1; j <= days; j++) {
                double goldDay = Double.parseDouble(scanner.nextLine());
                gold += goldDay;
            }
            averageGold = gold / days;
            if (averageGold >= average){
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageGold);
            } else {
                System.out.printf("You need %.2f gold.\n", average - averageGold);
            }
        }
    }
}
