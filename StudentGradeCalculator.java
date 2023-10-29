import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-::::STUDENT GRADE CALCULATOR::::::-");
        
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        
        if (numberOfSubjects <= 0) {
            System.out.println("Invalid input. Please enter a positive number of subjects.");
            return; // Exit the program
        }
        
        int totalMarks = 0;
        
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in Subject " + i + ": ");
            int marks = sc.nextInt();
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be in the range 0-100.");
                return; // Exit the program
            }
            
            totalMarks += marks;
        }
        
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'O';
            System.out.println("Excellent! Keep up the good work.");
        } else if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 50) {
            grade = 'D';
        } else if (averagePercentage >= 40) {
            grade = 'P';
        } else {
            grade = 'F';
        }
        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
        
        // Close the scanner to free up resources
        sc.close();
    }
}
