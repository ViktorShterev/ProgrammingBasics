package NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        for (int i = num1; i <= num2; i++) {
            String current = "" + i;
            int even = 0;
            int odd = 0;
            for (int j = 0; j < current.length(); j++) {
                int currentDigit = Integer.parseInt("" + current.charAt(j));
                if (j % 2 == 0){
                    even += currentDigit;
                } else {
                    odd += currentDigit;
                }
            }
            if (odd == even){
                System.out.print(i + " ");
            }
        }
    }
}
