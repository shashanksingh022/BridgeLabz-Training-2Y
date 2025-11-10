/*1. Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and
marks. Add two methods:
● To calculate the grade based on the marks.
● To display the student&#39;s details and grade.
Explanation: The Student class organizes all relevant details about a student as
attributes. Methods are used to calculate the grade and provide a way to display all
information.
*/
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else if (marks >= 35) {
            return 'D';
        } else {
            return 'F'; // Fail
        }
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Creating object
        Student student = new Student(name, rollNumber, marks);

        // Displaying report
        System.out.println("\n--- Student Report ---");
        student.displayDetails();
    }
}
