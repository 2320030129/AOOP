package sis;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String id;
    private String name;
    private List<String> enrolledStudents;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents);
    }

    @Override
    public void enrollStudent(String studentId) {
        enrolledStudents.add(studentId);
    }
}
