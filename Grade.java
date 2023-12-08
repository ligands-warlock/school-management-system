// Grade.java
public class Grade {
    private Course course;
    private Student student;
    private char grade;

    public Grade(Course course, Student student, char grade) {
        this.course = course;
        this.student = student;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Course ID: " + course.getCourseId());
        System.out.println("Grade: " + grade);
    }
}
