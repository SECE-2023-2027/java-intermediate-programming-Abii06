package Problem_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        Employee employee = new Employee(name, salary);
        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();
        Manager manager = new Manager(name, salary, bonus);
        System.out.println("Employee Total Salary: " + employee.calculateTotalSalary());
        System.out.println("Manager Total Salary: " + manager.calculateTotalSalary());

        sc.close();
    }
}
