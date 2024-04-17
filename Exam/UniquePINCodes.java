package Exam;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        boolean first = false;
        boolean second = false;
        boolean third = false;
        for (int i = 2; i <= num1; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            for (int j = 2; j <= num2; j++) {
                if (j % num2 != 0){
                    System.out.print(j + " ");
                }
                for (int k = 2; k <= num3; k++) {
                    if (k % 2 == 0) {
                        System.out.println(i + " ");
                    }
                }
            }
        }
    }
}
