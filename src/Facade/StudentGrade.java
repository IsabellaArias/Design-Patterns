package Facade;

public class StudentGrade {
    private Student student;

    public StudentGrade() {
        this.student = new Student();
    }
    public void StudentInfo(){
        student.lookingStudentName();
        student.studentGrade();
        student.studentSucess();
    }
}
