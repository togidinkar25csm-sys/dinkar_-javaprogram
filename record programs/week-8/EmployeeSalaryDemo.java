package task1;

//Interface 1
interface SalaryCalculator {
 double calculateSalary();
}

//Interface 2
interface Bonusable {
 double calculateBonus();
}


//Permanent Employee - implements both interfaces
class PermanentEmployee implements SalaryCalculator, Bonusable {
 private String name;
 private double basicPay;
 private double allowances;

 PermanentEmployee(String name, double basicPay, double allowances) {
     this.name = name;
     this.basicPay = basicPay;
     this.allowances = allowances;
 }

 @Override
 public double calculateSalary() {
     return basicPay + allowances;
 }

 @Override
 public double calculateBonus() {
     return basicPay * 0.10; // 10% of basic pay
 }

 public String getName() {
     return name;
 }
}


//Contract Employee - implements only SalaryCalculator
class ContractEmployee implements SalaryCalculator {
 private String name;
 private double hoursWorked;
 private double hourlyRate;

 ContractEmployee(String name, double hoursWorked, double hourlyRate) {
     this.name = name;
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }

 public String getName() {
     return name;
 }
}


//Manager - implements both interfaces, with team-size-based bonus
class Manager implements SalaryCalculator, Bonusable {
 private String name;
 private double basicPay;
 private int teamSize;

 Manager(String name, double basicPay, int teamSize) {
     this.name = name;
     this.basicPay = basicPay;
     this.teamSize = teamSize;
 }

 @Override
 public double calculateSalary() {
     return basicPay + (teamSize * 500); // team handling allowance
 }

 @Override
 public double calculateBonus() {
     return basicPay * 0.20 + (teamSize * 200); // 20% + per-member bonus
 }

 public String getName() {
     return name;
 }
}


//Main class
public class EmployeeSalaryDemo {
 public static void main(String[] args) {

     SalaryCalculator[] employees = {
         new PermanentEmployee("Ananya", 40000, 5000),
         new ContractEmployee("Rahul", 160, 350),
         new Manager("Karthik", 60000, 8)
     };

     for (SalaryCalculator emp : employees) {
         String name = getName(emp);
         double salary = emp.calculateSalary();

         System.out.println("===== " + name + " (" + emp.getClass().getSimpleName() + ") =====");
         System.out.printf("Salary : Rs.%.2f%n", salary);

         if (emp instanceof Bonusable) {
             double bonus = ((Bonusable) emp).calculateBonus();
             System.out.printf("Bonus  : Rs.%.2f%n", bonus);
             System.out.printf("Total  : Rs.%.2f%n", salary + bonus);
         } else {
             System.out.println("Bonus  : Not applicable (contract employee)");
         }
         System.out.println();
     }
 }

 // Helper to fetch name regardless of concrete type
 private static String getName(SalaryCalculator emp) {
     if (emp instanceof PermanentEmployee pe) return pe.getName();
     if (emp instanceof ContractEmployee ce) return ce.getName();
     if (emp instanceof Manager m) return m.getName();
     return "Unknown";
 }
}