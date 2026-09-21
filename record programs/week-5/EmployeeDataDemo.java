package task1;

class Employee {
    private int empId;
    private String name;
    private String department;
    private double salary;

    // 1. Default constructor
    Employee() {
        this.empId = 0;
        this.name = "Not Assigned";
        this.department = "Not Assigned";
        this.salary = 0.0;
    }

    // 2. Constructor with empId and name only
    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
        this.department = "Not Assigned";
        this.salary = 0.0;
    }

    // 3. Constructor with empId, name, and department
    Employee(int empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = 0.0;
    }

    // 4. Fully parameterized constructor
    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.printf("Salary      : Rs.%.2f%n", salary);
    }
}


// Main class
public class EmployeeDataDemo {
    public static void main(String[] args) {

        System.out.println("===== EMPLOYEE 1 (Default Constructor) =====");
        Employee emp1 = new Employee();
        emp1.displayDetails();

        System.out.println("\n===== EMPLOYEE 2 (empId, name) =====");
        Employee emp2 = new Employee(101, "Ravi Kumar");
        emp2.displayDetails();

        System.out.println("\n===== EMPLOYEE 3 (empId, name, department) =====");
        Employee emp3 = new Employee(102, "Sneha Reddy", "Human Resources");
        emp3.displayDetails();

        System.out.println("\n===== EMPLOYEE 4 (Fully Parameterized) =====");
        Employee emp4 = new Employee(103, "Arjun Rao", "Engineering", 65000.00);
        emp4.displayDetails();
    }
}