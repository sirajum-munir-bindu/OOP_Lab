public class Employees {
    private String ename;
    private String eid;

    public Employees(String ename , String eid)
    {
        this.ename = ename;
        this.eid = eid;
    }

    public void displayEmployees()
    {
        System.out.println("Employee Name: "+ename+"  Employee id: "+eid);
    }
}
