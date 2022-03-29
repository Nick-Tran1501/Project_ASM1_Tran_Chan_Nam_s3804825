import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CoderResult;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
//        StudentsOfCourse();
//        CoursesOfStudent();

Addcoursestosem();


    }
    public static void  StudentsOfCourse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your StudentID, Name, DOB");
        Student s1 = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println("please input your StudentID, Name, DOB");
        Student s2 = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println("Please input CourseID, CourseName, And Credit");
        Course c1 = new Course("C001", "SADI", 12);
        c1.enroll(s1);
        c1.enroll(s2);
        System.out.println(c1.getCourseID()+":"+c1.getStudentList().toString());
    }
    public static void CoursesOfStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input CourseID, CourseName, And Credit");
        Course c1 = new Course(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
        System.out.println("please input your StudentID, Name, DOB");
        Student s1 = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        if (c1.enroll(s1)) {
            System.out.println("Successfully enrolled");

        } else {
            System.out.println("Already in there");
        }
        if (c1.enroll(s1)) {
            System.out.println("Successfully enrolled");

        } else {
            System.out.println("Already in there");
        }
        System.out.println(s1.getStudentName() + ":" + s1.getCourseList());
    }

    public static void Addcoursestosem(){
        StudentEnrolment system = new StudentEnrolment();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Semester: ");
        String semesterinput= scanner.next();
        System.out.println("Enter CourseID, CourseName, CourseCredit");
        Course course = new Course(scanner.next(),scanner.next(),scanner.nextInt());
        system.coursecreator(semesterinput,course);
        System.out.println(system.coursecreator(semesterinput,course));
    }
};
