import java.util.ArrayList;

public class Department {
    private String dname;

    private ArrayList<Employees> employees = new ArrayList<>();

    public Department(String dname)
    {
        this.dname = dname;
    }

    public void addEmployees(Employees em)
    {
        employees.add(em);
    }

    public void displayDepartment()
    {
        System.out.println("Department Name: "+dname);
        for(Employees e: employees)
        {
            e.displayEmployees();
        }
    }
}
