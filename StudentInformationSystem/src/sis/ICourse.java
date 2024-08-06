package sis;

import java.util.List;

public interface ICourse {
    String getId();
    String getName();
    List<String> getEnrolledStudents();
    void enrollStudent(String studentId);
}
