public class Appears {
    private Student student;
    private Exam exam;
    private String date;
    private String sem;

    public Appears(Student s , Exam e , String date , String sem)
    {
        this.student = s;
        this.exam = e;
        this.date = date;
        this.sem= sem;
    }

    public void displayAppears()
    {
        student.displayStudent();
        exam.displayExam();
        System.out.println("Exam date:    "+date+"     Semester: "+sem);
    }
}
