// SchoolSystem.java
public class SchoolSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S001", "John Doe", 18);
        Student student2 = new Student("S002", "Jane Smith", 17);

        // Create courses
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "History");

        // Enroll students in courses and assign grades
        Grade grade1 = new Grade(course1, student1, 'A');
        Grade grade2 = new Grade(course2, student1, 'B');
        Grade grade3 = new Grade(course1, student2, 'C');
        Grade grade4 = new Grade(course2, student2, 'A');

        // Display information
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        course1.displayInfo();
        System.out.println();
        course2.displayInfo();
        System.out.println();
        grade1.displayInfo();
        System.out.println();
        grade2.displayInfo();
        System.out.println();
        grade3.displayInfo();
        System.out.println();
        grade4.displayInfo();
    }
}
