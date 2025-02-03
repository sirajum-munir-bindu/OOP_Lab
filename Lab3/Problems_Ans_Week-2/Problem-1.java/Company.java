import java.util.*;

public class Company {
    private String comName;

    ArrayList<Employee> e = new ArrayList<>();

    public Company(String comName)
    {
        this.comName = comName;
    }

    public void addEmployees(Employee employee)
    {
        e.add(employee);
    }

    public void displayCompany()
    {
        System.out.println("Company Name: "+comName);
        for(Employee em : e)
        {
            em.dispalayEmployee();
        }
    }
}
