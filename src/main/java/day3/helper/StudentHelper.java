package day3.helper;

import day3.model.Student;

public class StudentHelper {


    public static int calculateTotal(Student student) {
        return student.getMark().getTamil()
                + student.getMark().getEnglish()
                + student.getMark().getMaths()
                + student.getMark().getScience()
                + student.getMark().getSocial();
    }

    public static String findGrade(Student student) {
        int total = calculateTotal(student);
        int avg = total / 5;
        String grade = "";
        if (avg > 90) {
            grade = "A Grade";
        } else if (avg > 80 && avg < 90) {
            grade = "B Grade";
        } else if (avg > 65 && avg < 80) {
            grade = "C Grade";
        } else {
            grade = "Fail";
        }
        return grade;
    }

}
