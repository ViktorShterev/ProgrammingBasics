package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testH = Integer.parseInt(scanner.nextLine());
        int testM = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int realTm = testH * 60;
        int sumTm = realTm + testM;
        int realM = hour * 60;
        int sumM = realM + min;
        int sum1 = sumM - sumTm;
        int sum2 = sumTm - sumM;
        if (sum1 > 0 && sum1 <= 59) {
            System.out.println("Late");
            System.out.printf("%d minutes after the start", sum1);}
        else if (sum1 > 59){
                int sumH = sum1 / 60;
                int m = sum1 % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", sumH, m);
            }
        else if (sum2 > 0 && sum2 <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", sum2);
        }
        else if (sum2 == 0){
            System.out.println("On time");
        }
        else if (sum2 > 30 && sum2 <= 59){
            System.out.println("Early");
            System.out.printf("%d minutes before the start", sum2);}

        else if (sum2 > 59){
                int sumH = sum2 / 60;
                int m = sum2 % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", sumH, m);
            }

        }
    }
