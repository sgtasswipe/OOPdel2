package MyGrades;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private static int nextStudentNumber = 1000;
    private  int studentNumber = 1000;
    private String studentName;
    private int [] grades; // se patricks løsning https://github.com/keapaagdat23a/_2023-09-19---OOP2.git
    private  int nextGrade;




    public Student(String studentName) {
       studentNumber = nextStudentNumber++;
        grades = new int[7];
        nextGrade= 0;
        setStudentName(studentName);

    }

    public int getStudentNumber() {
        return  studentNumber;
    }
    public String getStudentName() {
        return studentName;

    }

    public int[] getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        if (nextGrade < 7)
            grades[nextGrade++] = grade;


    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", studentName='" + studentName + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", nextGrade=" + nextGrade +
                '}';
    }
}


