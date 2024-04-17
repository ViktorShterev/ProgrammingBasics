package ExamPrep2;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int winCount = 0;
        int loseCount = 0;
        double moneyAll = 0;
        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();
            double money = 0;
            int win = 0;
            int lose = 0;
            double moneyDay = 0;
            while (!input.equals("Finish")){
                String result = scanner.nextLine();
                if (result.equals("win")){
                    money += 20;
                    win++;
                } else {
                    lose++;
                }
                input = scanner.nextLine();
            }
            moneyDay += money;
            if (win > lose){
                moneyDay = moneyDay + moneyDay * 0.1;
                winCount++;
            } else {
                loseCount++;
            }
            moneyAll += moneyDay;
        }
        if (winCount > loseCount){
            moneyAll = moneyAll + moneyAll * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", moneyAll);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", moneyAll);
        }
    }
}
