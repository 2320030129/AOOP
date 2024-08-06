package sis;

import java.util.HashMap;
import java.util.Map;

public class SISConcreteFactory extends SISFactory {
    private Map<String, IStudent> students = new HashMap<>();
    private Map<String, ICourse> courses = new HashMap<>();

    @Override
    public IStudent createStudent(String id, String name) {
        IStudent student = new Student(id, name);
        students.put(id, student);
        return student;
    }

    @Override
    public ICourse createCourse(String id, String name) {
        ICourse course = new Course(id, name);
        courses.put(id, course);
        return course;
    }

    @Override
    public IEnrollment createEnrollment() {
        return new Enrollment(students, courses);
    }
}
