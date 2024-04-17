package Exam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 5364;
        int end = 8848;
        int count = 1;
        boolean isSleep = false;
        for (int i = 1; i <= 5; i++) {
            if (start >= end) {
                break;
            }
            String input = scanner.nextLine();

            while (!input.equals("END")) {
                int meters = Integer.parseInt(scanner.nextLine());
                switch (input) {
                    case "Yes":
                        count++;
                        isSleep = true;
                        break;
                    case "No":
                        isSleep = false;
                        break;
                }
                if (count > 5) {
                    break;
                }
                start += meters;

                if (isSleep) {
                    break;
                }
                input = scanner.nextLine();
            }
            if (input.equals("END")) {
                System.out.printf("Failed!\n%d", start);
                break;
            }

            if (start >= end) {
                System.out.printf("Goal reached for %d days!", count);

            }
        }
    }}
