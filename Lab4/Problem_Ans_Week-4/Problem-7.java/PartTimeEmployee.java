public class PartTimeEmployee extends Employee{
    private double ptimeSalary;

    public PartTimeEmployee(double ptimeSalary)
    {
        this.ptimeSalary = ptimeSalary;
    }

    public void calculateSalary()
    {
        System.out.println(ptimeSalary);
    }
}
