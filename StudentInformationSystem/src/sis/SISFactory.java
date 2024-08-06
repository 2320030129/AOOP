package sis;

public abstract class SISFactory {
    public abstract IStudent createStudent(String id, String name);
    public abstract ICourse createCourse(String id, String name);
    public abstract IEnrollment createEnrollment();
}
