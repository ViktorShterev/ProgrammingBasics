package ExamPreparation;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basket = 1.5;
        double wreath = 3.8;
        double chocolateBunny = 7.0;
        double total = 0;
        double average = 0;
        double end = 0;
        int people = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= people; i++) {
            String input = scanner.nextLine();
            double sum = 0;
            int count = 0;
            while (!input.equals("Finish")) {
                count++;
                switch (input) {
                    case "basket":
                        sum += basket;
                        break;
                    case "wreath":
                        sum += wreath;
                        break;
                    case "chocolate bunny":
                        sum += chocolateBunny;
                        break;
                }
                total = sum;

                input = scanner.nextLine();
            }
            if (count % 2 == 0){
                total = total - total * 0.2;
            }
            System.out.printf("You purchased %d items for %.2f leva.\n", count, total);
            end += total;
        }
        average = end / people;
        System.out.printf("Average bill per client is: %.2f leva.", average);
    }
}