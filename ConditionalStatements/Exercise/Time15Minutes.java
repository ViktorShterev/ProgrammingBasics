package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int totalMin = hour * 60 + min + 15;
        int totalHour = totalMin / 60;
        int newMin = totalMin % 60;
        if (totalHour >= 24) {
            totalHour = 0;
            System.out.printf("%d:%02d", totalHour, newMin);
        } else {
            System.out.printf("%d:%02d", totalHour, newMin);
        }

    }
}
