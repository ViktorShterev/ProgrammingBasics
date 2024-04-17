package ExamPrep2;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double space = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("End")) {
            double luggageSpace = Double.parseDouble(input);
            count++;
            if (count % 3 == 0) {
                luggageSpace = luggageSpace + luggageSpace * 0.1;
            }
            space -= luggageSpace;
            if (space < 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (space < 0) {
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", count - 1);
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", count);
        }
    }
}
