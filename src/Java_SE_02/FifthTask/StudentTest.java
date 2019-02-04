package Java_SE_02.FifthTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student testStudent = new Student("Vasya");

    @Test
    void addClass() {
        testStudent.addClass(Classes.PHYSICS_CLASS, 4.5);
        testStudent.addClass(Classes.MATH_CLASS, 3);
        testStudent.addClass(Classes.IT_CLASS, 5.0);
        System.out.println(testStudent.getClassesOfStudentWithoutMarks());
    }

    @Test
    void correctMark() {
        testStudent.addClass(Classes.PHYSICS_CLASS, 4.5);
        testStudent.addClass(Classes.MATH_CLASS, 3);
        testStudent.addClass(Classes.IT_CLASS, 5.0);
        testStudent.correctMark(Classes.MATH_CLASS, 4);
        assertEquals(4.0, testStudent.getMarkOf(Classes.MATH_CLASS));
        System.out.println(testStudent.getName());
    }
}