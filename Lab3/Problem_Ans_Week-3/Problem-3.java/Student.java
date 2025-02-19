public class Student {
    private String name;
    private String roll;
    private double grade;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setRoll(String roll)
    {
        this.roll = roll;
    }
    public String getRoll()
    {
        return roll;
    }
    public void setGrade(double grade)
    {
        if(grade >= 33 && grade <= 100)
        {
            this.grade = grade;
        }
        else{
            System.out.println("Please Batter then Next time...");
        }
    }
    public double getGrade()
    {
        return grade;
    }

    public void displayStudent()
    {
        System.out.println("Student Name: "+name+"\nStudent Roll: "+roll+"\nStudent Grade: "+grade);
    }
}
