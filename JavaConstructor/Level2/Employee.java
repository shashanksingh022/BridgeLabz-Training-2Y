 /*Problem 4: Employee Records
Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department. */ 


    
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to ₹" + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("-----------------------------");
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + getSalary());
        System.out.println("Team: " + teamName);
        System.out.println("-----------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 40000);
        e1.displayEmployeeDetails();
        e1.setSalary(45000);
        System.out.println();

        Manager m1 = new Manager(201, "HR", 60000, "Recruitment");
        m1.displayManagerDetails();
        m1.setSalary(65000);
    }
}
