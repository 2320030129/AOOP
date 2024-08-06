package sis;

import java.util.Map;

public class Enrollment implements IEnrollment {
    private Map<String, IStudent> students;
    private Map<String, ICourse> courses;

    public Enrollment(Map<String, IStudent> students, Map<String, ICourse> courses) {
        this.students = students;
        this.courses = courses;
    }

    @Override
    public void enrollStudentInCourse(String studentId, String courseId) {
        IStudent student = students.get(studentId);
        ICourse course = courses.get(courseId);

        if (student != null && course != null) {
            student.enrollInCourse(courseId);
            course.enrollStudent(studentId);
        }
    }
}
