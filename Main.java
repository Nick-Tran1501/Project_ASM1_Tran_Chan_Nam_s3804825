import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CoderResult;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
    StudentEnrolment enrolmentsystem = new StudentEnrolment();
    Scanner userinput = new Scanner(System.in);
    // Student List

//        System.out.println(enrolmentsystem.getStudents());
    // Course List
//        System.out.println(enrolmentsystem.getCourses());

    // enrol course

        enrolmentsystem.getCourses().get(0).enroll(enrolmentsystem.getStudents().get(0));
        enrolmentsystem.getCourses().get(1).enroll(enrolmentsystem.getStudents().get(0));
        enrolmentsystem.getCourses().get(0).enroll(enrolmentsystem.getStudents().get(1));
        System.out.println(enrolmentsystem.getStudents().get(0).getStudentName()+":"+enrolmentsystem.getStudents().get(0).getCourseList());
        System.out.println(enrolmentsystem.getCourses().get(0).getCourseName()+":"+enrolmentsystem.getCourses().get(0).getStudentList());

        // enrol to list with sem
        System.out.println("Please input Student ID: ");
        String stuIDinput = userinput.next();
        System.out.println("Please input Course ID: ");
        String courIDinput = userinput.next();
        System.out.println("Please input semester: ");
        String seminput = userinput.next();
        enrolmentsystem.addenrolments(stuIDinput,courIDinput,seminput);


    }

};
