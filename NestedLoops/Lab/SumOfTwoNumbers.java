package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        int comb = 0;
        boolean isFound = false;
        int firstNum = 0;
        int secondNum = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                comb++;
                if (i + j == num) {
                    isFound = true;
                    firstNum = i;
                    secondNum = j;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (isFound){
            System.out.printf("Combination N:%d (%d + %d = %d)", comb, firstNum, secondNum, num);
        } else {
            System.out.printf("%d combinations - neither equals %d",comb,num);
        }
    }
}
