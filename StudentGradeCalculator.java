import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + " (out of 100):");
            totalMarks += scanner.nextInt();
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + calculateGrade(averagePercentage));
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'O';
        } else if (averagePercentage >= 80) {
            return 'A';
        } else if (averagePercentage >= 70) {
            return 'B';
        } else if (averagePercentage >= 60) {
            return 'C';
        } else {
            return 'F';
        }
    }
}