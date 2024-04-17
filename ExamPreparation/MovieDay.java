package ExamPreparation;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timePhoto = Integer.parseInt(scanner.nextLine());
        int scene = Integer.parseInt(scanner.nextLine());
        int timeForScene = Integer.parseInt(scanner.nextLine());
        double warmup = timePhoto * 0.15;
        double sum = scene * timeForScene + warmup;
        if (timePhoto >= sum){
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(timePhoto - sum));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.abs(Math.round(timePhoto - sum)));
        }
    }
}
