package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGrades = Integer.parseInt(scanner.nextLine());
        int failed = 0;
        int solved = 0;
        double allGrades = 0;
        String lastProblem = "";
        while (failed < poorGrades) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")){
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                failed++;
            }
            allGrades += grade;
            solved++;
            lastProblem = problemName;}
        if (failed >= poorGrades) {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        } else {
                System.out.printf("Average score: %.2f%n", allGrades / solved);
                System.out.printf("Number of problems: %d%nLast problem: %s", solved, lastProblem);

            }}}

