package Exam;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sumLiter = 0;
        double sumGrad = 0;
        double allGrad = 0;
        double endGrad = 0;
        for (int i = 1; i <= n; i++) {
            double liter = Double.parseDouble(scanner.nextLine());
            double grad = Double.parseDouble(scanner.nextLine());
            sumLiter += liter;
            sumGrad = grad * liter;
            allGrad += sumGrad;
            endGrad = allGrad / sumLiter;
        }
        System.out.printf("Liter: %.2f\n", sumLiter);
        System.out.printf("Degrees: %.2f\n", endGrad);
        if (endGrad < 38){
            System.out.println("Not good, you should baking!");
        } else if (endGrad <= 42){
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
