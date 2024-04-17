package NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {

            int firstNum = i / 1000 % 10;
            int secondNum = i / 100 % 10;
            int thirdNum = i / 10 % 10;
            int forthNum = i % 10;

            boolean first = num % firstNum == 0;
            boolean second = secondNum != 0 && num % secondNum == 0;
            boolean third = thirdNum != 0 && num % thirdNum == 0;
            boolean forth = forthNum != 0 && num % forthNum == 0;

            if (first && second && third && forth){
                System.out.printf("%d ", i);
            }
        }
    }
}
