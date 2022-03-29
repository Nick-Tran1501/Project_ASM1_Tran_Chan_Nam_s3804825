import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String args[]) throws IOException {
        //example objects for testing
        Course c1 = new Course("C001", "SADI", 12);
        Course c2 = new Course("C002", "Further", 12);
        Course c3 = new Course("C003", "Pro", 12);

        Student s1 = new Student("s123","Nam","15/01/2001");
        Student s2 = new Student("s124","Duan","16/01/2001");
        Student s3 = new Student("s125","Dep Trai","17/01/2001");




        StudentEnrolment student1= new StudentEnrolment();

        System.out.println(student1.getSemesters());
        System.out.println(student1.getCourses());
        System.out.println(student1.getStudents());
    }
}
