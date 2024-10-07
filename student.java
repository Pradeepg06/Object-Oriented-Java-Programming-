import java.util.Scanner;

public class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;
    private int numSubjects;

    // Constructor
    public Student(int numSubjects) {
        this.numSubjects = numSubjects;
        this.credits = new int[numSubjects];
        this.marks = new int[numSubjects];
    }

    // Method to accept student details
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ": Credits = " + credits[i] + ", Marks = " + marks[i]);
        }
    }

    // Method to calculate SGPA
    public double calculateSGPA() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < numSubjects; i++) {
            totalCredits += credits[i];

            // Convert marks to grade points (assuming 10-point scale)
            double gradePoints = 0;
            if (marks[i] >= 90) gradePoints = 10;
            else if (marks[i] >= 80) gradePoints = 9;
            else if (marks[i] >= 70) gradePoints = 8;
            else if (marks[i] >= 60) gradePoints = 7;
            else if (marks[i] >= 50) gradePoints = 6;
            else gradePoints = 0;

            totalGradePoints += credits[i] * gradePoints;
        }

        return totalGradePoints / totalCredits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        Student student = new Student(numSubjects);
        student.acceptDetails();
        student.displayDetails();

        double sgpa = student.calculateSGPA();
        System.out.println("\nSGPA: " + sgpa);
    }
}