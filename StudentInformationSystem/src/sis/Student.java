package sis;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String id;
    private String name;
    private List<String> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
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
    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public void enrollInCourse(String courseId) {
        courses.add(courseId);
    }
}
