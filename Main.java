import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CoderResult;
import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
    StudentEnrolment enrolmentsystem = new StudentEnrolment();
        //create Student
//        Student student1 = new Student("s3804825","Tran Chan Nam", "15/01/2001");
//        Student student2 = new Student("s3804826","Pham Ly Thuy Vy","08/03/2001");
//        Student student3 = new Student("s3804827","Larry","09/01/2001");
        enrolmentsystem.newone("Student","s3804827","Larry","09/01/2001");
        enrolmentsystem.newone("Student","s3804826","Pham Ly Thuy Vy","08/03/2001");
        enrolmentsystem.newone("Student","s3804825","Tran Chan Nam", "15/01/2001");

        // create Courses
        enrolmentsystem.newone("Course", "COSC2440", "Further Programming", "12");
        enrolmentsystem.newone("Course", "ISYS2101", "SEPM", "12");
        enrolmentsystem.newone("Course", "FSN2001", "Fashion", "12");
//        Scanner userinput = new Scanner(System.in);
//
//        // create a new Student or Course
//        System.out.println("Please input Student or Course");
//        String userin = userinput.next();
//        if(userin.equals("Student")){
//            System.out.println("StudentID, Student Name, DOB");
//            String newstuID = userinput.next();
//            String newstuName = userinput.next();
//            String newstuDOB = userinput.next();
//            enrolmentsystem.newone(userin,newstuID,newstuName,newstuDOB);
//        }
//        if(userin.equals("Course")){
//            System.out.println("CourseID, Coures Name, Credit");
//            String newcourID = userinput.next();
//            String newcourName = userinput.next();
//            String newcourcredit = userinput.next();
//            enrolmentsystem.newone(userin,newcourID,newcourName,newcourcredit);
//        }


    // Student List
        System.out.println(enrolmentsystem.getStudentsArrayList());
        System.out.println(enrolmentsystem.getSemesters());

    // Course List
        System.out.println(enrolmentsystem.getCourseArrayList());

    // Student enrol course without semester
//        enrolmentsystem.getCourses().get(0).enroll(enrolmentsystem.getStudents().get(0));
//        enrolmentsystem.getCourses().get(1).enroll(enrolmentsystem.getStudents().get(0));
//        enrolmentsystem.getCourses().get(0).enroll(enrolmentsystem.getStudents().get(1));
//        System.out.println(enrolmentsystem.getStudents().get(0).getStudentName()+":"+enrolmentsystem.getStudents().get(0).getCourseList());
//        System.out.println(enrolmentsystem.getCourses().get(0).getCourseName()+":"+enrolmentsystem.getCourses().get(0).getStudentList());


        // add course to semester
//        System.out.println("Please input Semester: ");
//        String semesterin = userinput.next();
        enrolmentsystem.coursecreator("2022A","COSC2440");
        enrolmentsystem.coursecreator("2022A","ISYS2101");
        System.out.println(enrolmentsystem.getCourseandsemeseter());
        // enrol to list with sem

        enrolmentsystem.addenrolments("s3804825","COSC2440","2022A");
        enrolmentsystem.addenrolments("s3804826","ISYS2101","2022A");
        System.out.println(enrolmentsystem.getEnrolments());


        //
    }

};
