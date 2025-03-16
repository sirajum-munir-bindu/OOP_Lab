public class Employee {
    private String name;
    private double salary;
    private String position;

    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println(name + "'s salary increased by $" + amount);
        } else {
            System.out.println("Invalid salary increment.");
        }
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name + ", Position: " + position + ", Salary: $" + salary);
    }
}
