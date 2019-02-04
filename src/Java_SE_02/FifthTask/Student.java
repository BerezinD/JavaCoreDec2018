package Java_SE_02.FifthTask;

import java.util.HashMap;
import java.util.Set;

public class Student {
    private String name;
    private HashMap<Classes, Number> classesOfStudent = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClass(Classes classOf, Number mark) {
        switch (classOf) {
            case IT_CLASS:
                classesOfStudent.put(classOf, mark.doubleValue());
                break;
            case MATH_CLASS:
                classesOfStudent.put(classOf, mark.doubleValue());
                break;
            case PHYSICS_CLASS:
                classesOfStudent.put(classOf, mark.doubleValue());
                break;
            case ASTRONOMIC_CLASS:
                classesOfStudent.put(classOf, mark.intValue());
                break;
            case BIOLOGICAL_CLASS:
                classesOfStudent.put(classOf, mark.intValue());
                break;
        }
        AllClasses.getInstance().addStudentsToClass(this, classOf);
    }

    public boolean correctMark(Classes classOf, Number newMark) {
        System.out.println(classesOfStudent);
        if (classesOfStudent.get(classOf) == null) return false;
        this.addClass(classOf, newMark);
        return true;
    }

    public Set<Classes> getClassesOfStudentWithoutMarks() {
        return classesOfStudent.keySet();
    }

    public Number getMarkOf(Classes classOf) {
        return classesOfStudent.get(classOf);
    }
}

enum Classes {
    MATH_CLASS,
    BIOLOGICAL_CLASS,
    ASTRONOMIC_CLASS,
    PHYSICS_CLASS,
    IT_CLASS
}