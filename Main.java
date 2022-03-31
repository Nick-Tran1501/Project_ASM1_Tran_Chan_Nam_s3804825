import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CoderResult;
import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Academic Assistant" +
                "\n");

    StudentEnrolment enrolmentsystem = new StudentEnrolment();
        //create Student
        enrolmentsystem.newone("Student","s3804827","Larry","09/01/2001");
        enrolmentsystem.newone("Student","s3804826","Pham Ly Thuy Vy","08/03/2001");
        enrolmentsystem.newone("Student","s3804825","Tran Chan Nam", "15/01/2001");

        // create Courses
        enrolmentsystem.newone("Course", "COSC2440", "Further Programming", "12");
        enrolmentsystem.newone("Course", "ISYS2101", "SEPM", "12");
        enrolmentsystem.newone("Course", "FSN2001", "Fashion", "12");

    // Student List
//        System.out.println(enrolmentsystem.getStudentsArrayList());

        // Semester list
//        System.out.println(enrolmentsystem.getSemesters());

    // Course List
        System.out.println(enrolmentsystem.getCourseArrayList());

    // Student enrol course without semester
//        enrolmentsystem.getCourseArrayList().get(0).enroll(enrolmentsystem.getStudentsArrayList().get(2));
//        enrolmentsystem.getCourseArrayList().get(1).enroll(enrolmentsystem.getStudentsArrayList().get(2));
//        enrolmentsystem.getCourseArrayList().get(2).enroll(enrolmentsystem.getStudentsArrayList().get(2));



        // add course to semester
        enrolmentsystem.getSemesters();
        enrolmentsystem.coursecreator("2022A","COSC2440");
        enrolmentsystem.coursecreator("2022A","ISYS2101");
        System.out.println(enrolmentsystem.getCourseandsemeseter());

        //enrol course
        enrolmentsystem.enroll("s3804825","COSC2440");
        enrolmentsystem.enroll("s3804825","ISYS2101");


        // enrol to list with sem
        enrolmentsystem.addenrolments("s3804825","COSC2440","2022A");
        enrolmentsystem.addenrolments("s3804826","ISYS2101","2022A");
        System.out.println(enrolmentsystem.getEnrolments());


        // All Courses of a Student in a semester
        enrolmentsystem.getOne("s3804825");

        // All Students in a Course
        enrolmentsystem.getAll("COSC2440");
    }

};
