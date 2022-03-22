import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]) {
        Course c1 = new Course("C001", "SADI", 12);
        Course c2 = new Course("C002", "Further", 12);
        Student s1 = new Student("s001", "minh", "15/01/2001");
        Student s2 = new Student("s002", "ben", "15/01/2001");
//        List<String> studentEnroll = new ArrayList<>();
//        List<String> studentCourse = new ArrayList<>();
        StudentList student1= new StudentList();
//
//        if (c1.enroll(s1)) {
//            System.out.println("Successfully enrolled");
//
//        } else {
//            System.out.println("Already in there");
//        }
//        if (c1.enroll(s2)) {
//            System.out.println("Successfully enrolled");
//
//        } else {
//            System.out.println("Already in there");
//        }
//
//        if (c2.enroll(s1)) {
//            System.out.println("Successfully enrolled");
//
//        } else {
//            System.out.println("Already in there");
//        }

//        studentEnroll.add(s1.getCourseList().toString());
//        studentCourse.add(c1.getStudentList().toString());

//        System.out.println(c1.getStudentList().toString());
        student1.addStudent(s1);
        student1.addStudent(s2);
//        student1.addCourse(c1);
//        student1.setSemester("2021A");
        System.out.println(student1);
//        System.out.println(s1.toString() + "\n" + studentEnroll);
//        System.out.println(studentCourse);
    }
}
