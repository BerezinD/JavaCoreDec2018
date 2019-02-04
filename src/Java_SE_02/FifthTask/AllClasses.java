package Java_SE_02.FifthTask;

import java.util.HashSet;
import java.util.Set;

public class AllClasses {
    /**
     * It's a Singleton
     * allClasses is array of set of students
     * 0 - position of this array means set of students of MATH_CLASS
     * 1 - students of BIOLOGICAL_CLASS
     * 2 - ASTRONOMIC_CLASS
     * 3 - PHYSICS_CLASS
     * 4 - IT_CLASS
     */

    private static AllClasses allClassesInstance;
    private Set<Student>[] allClasses = new Set[5];

    private AllClasses() {
        //it's a singleton (I hope...)
        for (int i = 0; i < 5; i++) {
            allClasses[i] = new HashSet<Student>();
        }
    }

    public static AllClasses getInstance() {
        if (allClassesInstance == null) {
            allClassesInstance = new AllClasses();
        }
        return allClassesInstance;
    }

    public void addStudentsToClass(Student student, Classes classOf) {
        switch (classOf) {
            case MATH_CLASS:
                allClasses[0].add(student);
                break;
            case BIOLOGICAL_CLASS:
                allClasses[1].add(student);
                break;
            case ASTRONOMIC_CLASS:
                allClasses[2].add(student);
                break;
            case PHYSICS_CLASS:
                allClasses[3].add(student);
                break;
            case IT_CLASS:
                allClasses[4].add(student);
                break;
        }
    }

    public void addStudentsToClass(Student student) {
        for (Classes classesOfStudent : student.getClassesOfStudentWithoutMarks()) {
            addStudentsToClass(student, classesOfStudent);
        }
    }
}
