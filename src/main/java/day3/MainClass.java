package day3;

import day3.helper.StudentHelper;
import day3.model.Mark;
import day3.model.Student;

import java.util.Arrays;

public class MainClass {
    // Student -> 5 marks
    //2. Assign 3 student with 5 subject marks
    //3. create a method which caluclates the total of 5 subject marks of each student
    //4. create a method which finds the grade of each student
    //if average of marks is above 90 > A
    //							 80 to 90 B
    //							 65 to 80 C
    //							 < 65 fail

    public static void main(String[] args) {
        Student student1 = new Student("Indhu", new Mark(90, 95, 100, 94, 99));
        Student student2 = new Student("Mathi", new Mark(86, 78, 90, 98, 97));
        Student student3 = new Student("Nigi", new Mark(30, 40, 55, 66, 59));
        Student student4 = new Student("Thileeban", new Mark(30, 30, 35, 66, 59));

        for (Student student : Arrays.asList(student1, student2, student3, student4)) {
            System.out.println("Student '" + student.getStudentName() + "' total marks " + StudentHelper.calculateTotal(student));
            System.out.println("Student '" + student.getStudentName() + "' grade " + StudentHelper.findGrade(student));
        }
    }
}
