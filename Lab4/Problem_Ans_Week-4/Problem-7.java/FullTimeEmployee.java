public class FullTimeEmployee extends Employee{
    private double montlySalary;

    public FullTimeEmployee(double montlySalary)
    {
        this.montlySalary = montlySalary;
    }

    public void calculateSalary()
    {
        System.out.println(montlySalary);
    }
}
