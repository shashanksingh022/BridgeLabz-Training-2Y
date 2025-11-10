/*Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
○       A static variable companyName shared by all employees.
○       A static method displayTotalEmployees() to show the total number of employees.
This:
○       Use this to initialize name, id, and designation in the constructor.
Final:
○       Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof
○       Check if a given object is an instance of the Employee class before printing the employee details.
 */

 class Employee {
    private String name;
    private final int id;
    private String designation;

    static String companyName = "Tech Innovators";
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Not a valid Employee object!");
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("=============================");
    }
}

class Q3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kartik", 101, "Software Engineer");
        Employee e2 = new Employee("Aman", 102, "Project Manager");

        Employee.displayTotalEmployees();

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
    }
}
