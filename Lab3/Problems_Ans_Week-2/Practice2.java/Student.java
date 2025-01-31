public class Student {
    private String studid;
    private String name;
    private double cgpa;

    public Student(String studid , String name , double cgpa)
    {
        this.studid = studid;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displayStudent()
    {
        System.out.println("Student id: "+studid+"     Student Name: "+name+"       Student CGPA: "+cgpa);
    }
}
