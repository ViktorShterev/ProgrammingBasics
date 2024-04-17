package NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int prime = 0;
        int noPrime = 0;
        while (!input.equals("stop")){
            int num = Integer.parseInt(input);
            if (num < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int count = 1;
            for (int i = 2; i <= num; i++) {
                if (num % i == 0){
                    count++;
                }
            }
            if (count > 2){
                noPrime += num;
            } else {
                prime += num;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", noPrime);
    }
}
