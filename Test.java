import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) throws IOException {
        Course c1 = new Course("C001", "SADI", 12);
        Course c2 = new Course("C002", "Further", 12);
//        ArrayList<String> studentEnroll = new ArrayList<>();
//        ArrayList<String> studentCourse = new ArrayList<>();

        StudentEnrolment student1= new StudentEnrolment();
        Student s1 = new Student("s123","Nam","15/01/2001");
        Student s2 = new Student("s123","Duan","15/01/2001");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please input your StudentID, Name, DOB");
//        Student s3 = new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());

//        if (c1.enroll(s1)) {
//            System.out.println("Successfully enrolled");
//
//        } else {
//            System.out.println("Already in there");
//        }
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

//        studentEnroll.add(s3.getCourseList().toString());
//        studentCourse.add(c1.getStudentList().toString());
//
//        System.out.println(c1.getStudentList().toString());
//        System.out.println(s3.getCourseList().toString());
//        student1.addStudent(s3);

//
//        student1.addCourse(c1);
//        student1.setSemester("2021A");
        student1.update(s1,c1);
        student1.update(s2,c1);
//        System.out.println(student1);
//        student1.writetofile();
//        System.out.println(s1.getStudentName() + ":" + s1.getCourseList());
//        System.out.println(s2.getStudentName() + ":" + s2.getCourseList());
//        System.out.println(studentCourse);


    }
}
