package NestedLoops.Exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger = false;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                if (current > num){
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}
