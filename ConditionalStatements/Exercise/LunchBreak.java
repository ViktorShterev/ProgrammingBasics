package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int timeEpisode = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());
        double lunch = (double)timeBreak / 8.0;
        double rest = (double)timeBreak / 4.0;
        double remainingTime = (double)timeBreak - (lunch + rest);
        if (remainingTime >= (double)timeEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(remainingTime - (double)timeEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil((double)timeEpisode - remainingTime));
        }

    }
}
