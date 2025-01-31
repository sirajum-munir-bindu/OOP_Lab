public class Exam {
    private String examid;
    private String name;
    private double marks;

    public Exam(String examid , String name , double marks)
    {
        this.examid = examid;
        this.name = name;
        this.marks = marks;
    }

    public void displayExam()
    {
        System.out.println("Student Exam id: "+examid+"     Student Exam name: "+name+"      Student Marks: "+marks);
    }
}
