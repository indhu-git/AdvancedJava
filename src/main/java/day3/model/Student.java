package day3.model;

public class Student {
    private String studentName;
    private Mark mark;

    public Student(String studentName, Mark mark) {
        this.studentName = studentName;
        this.mark = mark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}
