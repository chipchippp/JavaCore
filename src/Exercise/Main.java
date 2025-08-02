package Exercise;

public class Main {
    public static void main(String[] args) {
        IEmployee employee = new PartTimeEmployee("John", 2000, 8);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Salary: " + employee.calculateSalary());

        IEmployee employee1 = new FullTimeEmployee("Jane", 2000);
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.calculateSalary());
        
    }
}
