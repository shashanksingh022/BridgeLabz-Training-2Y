/*Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics. */

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher, Subject: " + subject);
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student, Grade: " + grade);
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff, Department: " + department);
    }

    @Override
    public void displayDetails() {
        System.out.println("Staff: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Person p1 = new Teacher("Anita", 34, "Mathematics");
        Person p2 = new Student("Rahul", 16, "10th");
        Person p3 = new Staff("Vikram", 40, "Administration");

        ((Teacher) p1).displayRole();
        ((Student) p2).displayRole();
        ((Staff) p3).displayRole();

        Person[] people = { p1, p2, p3, new Teacher("Sonia", 29, "Physics") };
        for (Person p : people) {
            p.displayDetails();
        }
    }
}
