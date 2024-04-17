package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int newPoints = points;
        int pWins = 0;
        for (int i = 1; i <= tournaments; i++) {
            String place = scanner.nextLine();
            switch (place) {
                case "W":
                    pWins++;
                    newPoints += 2000;
                    break;
                case "F":
                    newPoints += 1200;
                    break;
                case "SF":
                    newPoints += 720;
                    break;
            }
        }
        int finalPoints = newPoints;
double pointsTour = 1.0 * (finalPoints - points) / tournaments;
double wins = 1.0 * pWins / tournaments * 100;
        System.out.printf("Final points: %d\n", finalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(pointsTour));
        System.out.printf("%.2f%%", wins);
    }
}

