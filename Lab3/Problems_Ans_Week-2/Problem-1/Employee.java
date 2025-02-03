public class Employee {
    private String empid;
    private String empname;
    private String empdeg;

    public Employee(String empid , String empname , String empdeg)
    {
        this.empid = empid;
        this.empname = empname;
        this.empdeg = empdeg;
    }

    public void dispalayEmployee()
    {
        System.out.println("Employee ID: "+empid+"\nEmployee Name: "+empname+"\nEmployee Designation: "+empdeg);
    }
}
