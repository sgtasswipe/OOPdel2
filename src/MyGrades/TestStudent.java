package MyGrades;


import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        new TestStudent().run();

    }
    private void run() {
        Student student1 = new Student("Jack");
        student1.setStudentName("Jack");
        student1.addGrade(-3);
        student1.addGrade(4);
        student1.addGrade(7);
        student1.addGrade(12);
        student1.addGrade(-3);
        student1.addGrade(12);
        student1.addGrade(7);
        student1.addGrade(7);
        student1.addGrade(7);
        student1.addGrade(7);


        System.out.println(Arrays.toString(student1.getGrades()));
        System.out.println(student1.getStudentNumber());
        System.out.println(student1.getStudentName());

    }
}
