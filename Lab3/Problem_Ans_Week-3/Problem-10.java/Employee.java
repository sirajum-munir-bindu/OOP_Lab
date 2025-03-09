public class Employee {
    private String name;
    private String designation;
    private double salary;

    public Employee(String name , String designation , double salary)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void promote(String newDesignation , double increment)
    {
        this.designation = newDesignation;
        this.salary = increment;
    }

    public void displayEmployee()
    {
        System.out.print("Employee Name: "+name+"\nEmployee Designation: "+designation+"\nEmployee Salary: "+salary);
    }
}
