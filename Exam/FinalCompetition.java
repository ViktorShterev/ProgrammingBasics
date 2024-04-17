package Exam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dancer = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner .nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        double sum = 0;
        switch (place){
            case "Bulgaria":
                sum = dancer * points;
                if (season.equals("summer")){
                    sum = sum - sum * 0.05;
                } else if (season.equals("winter")) {
                    sum = sum - sum * 0.08;
                }
                break;
            case "Abroad":
                sum = dancer * points + ((dancer * points) * 0.5);
                if (season.equals("summer")){
                    sum = sum - sum * 0.1;
                } else if (season.equals("winter")) {
                    sum = sum - sum * 0.15;
                }
                break;
        }
        double charity = sum * 0.75;
        double end = (sum - charity) / dancer;
        System.out.printf("Charity - %.2f\n", charity);
        System.out.printf("Money per dancer - %.2f", end);
    }
}
