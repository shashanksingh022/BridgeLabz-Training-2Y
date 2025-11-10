/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
 */
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + name + ", ID: " + id + ", Salary: " + salary + ", TeamSize: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer: " + name + ", ID: " + id + ", Salary: " + salary + ", Lang: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int durationMonths;

    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern: " + name + ", ID: " + id + ", Salary: " + salary + ", Duration: " + durationMonths + " months");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee e1 = new Manager("Aarav", 101, 120000.0, 8);
        Employee e2 = new Developer("Riya", 102, 90000.0, "Java");
        Employee e3 = new Intern("Kian", 103, 25000.0, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        Employee[] staff = {
            e1,
            e2,
            e3,
            new Developer("Neha", 104, 95000.0, "Python"),
            new Manager("Kabir", 105, 130000.0, 5)
        };

        for (Employee e : staff) {
            e.displayDetails();
        }
    }
}
