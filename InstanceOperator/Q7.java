/*Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
○       A static variable universityName shared across all students.
○       A static method displayTotalStudents() to show the number of students enrolled.
This:
○       Use this in the constructor to initialize name, rollNumber, and grade.
Final:
○       Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
○       Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
 */

 class Student {
    private String name;
    private final int rollNumber;
    private String grade;

    static String universityName = "Global University";
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Not a valid Student object!");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            grade = newGrade;
            System.out.println("Grade updated for Roll Number " + rollNumber + " to " + grade);
        } else {
            System.out.println("Cannot update grade. Not a Student object!");
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
        System.out.println("=============================");
    }
}

class Q7 {
    public static void main(String[] args) {
        Student s1 = new Student("Kartik", 101, "A");
        Student s2 = new Student("Aman", 102, "B");

        Student.displayTotalStudents();

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        s1.updateGrade("A+");
        s2.updateGrade("B+");

        s1.displayStudentDetails();
        s2.displayStudentDetails();
    }
}
