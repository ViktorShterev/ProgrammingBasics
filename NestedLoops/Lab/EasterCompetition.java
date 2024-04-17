package NestedLoops.Lab;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cake = Integer.parseInt(scanner.nextLine());
        int bestResult = Integer.MIN_VALUE;
        String bestName = "";
        for (int i = 1; i <= cake ; i++) {
            String name = scanner.nextLine();
            String input = scanner.nextLine();
            int points = 0;
            while (!input.equals("Stop")){
               points += Integer.parseInt(input);
               input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", name, points);
            if (points > bestResult){
                points = bestResult;
                bestName = name;
                System.out.printf("%s is the new number 1!\n", name);
            }

        }
        System.out.printf("%s won competition with %d points!", bestName, bestResult);
    }
}
