package sis;

public class main {
    public static void main(String[] args) {
        SISFactory factory = new SISConcreteFactory();

        IStudent student1 = factory.createStudent("1", "Alice");
        IStudent student2 = factory.createStudent("2", "Bob");

        ICourse course1 = factory.createCourse("101", "Math");
        ICourse course2 = factory.createCourse("102", "Science");

        IEnrollment enrollment = factory.createEnrollment();

        enrollment.enrollStudentInCourse("1", "101");
        enrollment.enrollStudentInCourse("2", "102");
        enrollment.enrollStudentInCourse("1", "102");

        System.out.println("Student 1 Courses: " + student1.getCourses());
        System.out.println("Student 2 Courses: " + student2.getCourses());
        System.out.println("Course 101 Students: " + course1.getEnrolledStudents());
        System.out.println("Course 102 Students: " + course2.getEnrolledStudents());
    }
}
