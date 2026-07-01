package Problem_4;
public class Employee {
private String name;
private double salary;

public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
}
double calculateTotalSalary() {
    return salary;
}
}
class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateTotalSalary() {
        return super.calculateTotalSalary()+ bonus;
    }
}