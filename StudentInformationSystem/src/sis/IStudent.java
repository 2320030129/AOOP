package sis;

import java.util.List;

public interface IStudent {
    String getId();
    String getName();
    List<String> getCourses();
    void enrollInCourse(String courseId);
}
