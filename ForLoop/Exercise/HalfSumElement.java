package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (max < num) {
                max = num;
            }}
            int sumWithoutMax = sum - max;
            if (max == sumWithoutMax) {
                System.out.printf("Yes\nSum = %d", max);
            } else {
                System.out.printf("No\nDiff = %d", Math.abs(max - sumWithoutMax));
            }
        }
    }

