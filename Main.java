import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CoderResult;
import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        StudentEnrolment enrolmentsystem = new StudentEnrolment();
        enrolmentsystem.getSemesters();
        // Current Students List
        enrolmentsystem.newone("Student","s3804827","Larry","09/01/2001");
        enrolmentsystem.newone("Student","s3804826","Pham Ly Thuy Vy","08/03/2001");
        enrolmentsystem.newone("Student","s3804825","Tran Chan Nam", "15/01/2001");

        // Current Course List
        enrolmentsystem.newone("Course", "COSC2440", "Further Programming", "12");
        enrolmentsystem.newone("Course", "ISYS2101", "SEPM", "12");
        enrolmentsystem.newone("Course", "FSN2001", "Fashion", "12");

        // 2022A Course
        enrolmentsystem.coursecreator("2022A", "COSC2440");
        enrolmentsystem.coursecreator("2022A", "ISYS2101");
        enrolmentsystem.coursecreator("2022A", "FSN2001");

        // 2022B Course
        enrolmentsystem.coursecreator("2022B", "COSC2440");
        enrolmentsystem.coursecreator("2022B", "ISYS2101");

        // 2022C Course

        enrolmentsystem.coursecreator("2022C", "COSC2440");
        enrolmentsystem.coursecreator("2022C", "ISYS2101");

        while (true) {
            Scanner userinput = new Scanner(System.in);
            System.out.println("Hello Academic Assistant" +
                    "\n" +
                    "What Do You Want to do:" +
                    "\n" +
                    "1.Create Student or Course " +
                    "\n" +
                    "2.Show Student, Course, Semester List" +
                    "\n" +
                    "3.Add Course to Semester" + "\n" +
                    "4.Student enroll Courses" +
                    "\n" +
                    "5.Update Enrolment list" +
                    "\n" +
                    "6.Exit");

            String inputopt = userinput.nextLine();
            // Create Student or Course
            if (inputopt.equals("1")) {
                System.out.println("Please input Student or Course: ");
                String createopt = userinput.nextLine();
                if(createopt.equalsIgnoreCase("Student")) {
                    System.out.println("Please input StudenID: ");
                    String studentID = userinput.nextLine();
                    System.out.println("Please input Name: ");
                    String studentName = userinput.nextLine();
                    System.out.println("Please input DOB: ");
                    String studentDOB = userinput.nextLine();
                    enrolmentsystem.newone(createopt, studentID, studentName, studentDOB);
                    continue;

                }
                if (createopt.equalsIgnoreCase("Course")) {
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input CourseName: ");
                    String courseName = userinput.nextLine();
                    System.out.println("Please input credit: ");
                    String coursecredit = userinput.nextLine();
                    enrolmentsystem.newone(createopt, courseID, courseName, coursecredit);
                    continue;
                }
                continue;
            }

            //Show Student, Course, Semester List
            if(inputopt.equals("2")){
                System.out.println("1. Student List" +
                        "\n" +
                        "2.Course List" +
                        "\n" +
                        "3. Semester list");
                String input = userinput.nextLine();
                if (input.equals("1")){
                    System.out.println(enrolmentsystem.getStudentsArrayList());
                    continue;
                }
                if (input.equals("2")){
                    System.out.println(enrolmentsystem.getCourseArrayList());
                    continue;
                }
                if (input.equals("3")){
                    System.out.println(enrolmentsystem.getSemesters());
                   continue;
                }
                continue;
            }

            //Add Course to Semester
            if (inputopt.equals("3")){
                System.out.println("Please input semester: ");
                String sems = userinput.nextLine();
                System.out.println("Please input CourseID: ");
                String courseID = userinput.nextLine();
                enrolmentsystem.coursecreator(sems,courseID);
                System.out.println(enrolmentsystem.getCourseandsemeseter());
                continue;
            }

            //Student enroll Courses
            if(inputopt.equals("4")){
                System.out.println("Please input student ID: ");
                String stuID = userinput.nextLine();
                System.out.println("Please input CourseID: ");
                String courseID = userinput.nextLine();
                enrolmentsystem.enroll(stuID,courseID);
                continue;

            }

            // Enrolment Add, delete, list
            if(inputopt.equals("5")){
                System.out.println("1. Add to Enrolment list:" +
                        "\n" +
                        "2. Remove Enrolment: " +
                        "\n" +
                        "3. Show Enrolment: " +
                        "\n" +
                        "4. All Course of a Student in a semester: " +
                        "\n" +
                        "e. All Student in a Course: ");
                String opt = userinput.nextLine();
                if(opt.equals("1")){
                    System.out.println("Please input student ID: ");
                    String stuID = userinput.nextLine();
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.addenrolments(stuID,courseID,sems);
                    continue;
                }
                if(opt.equals("2")){
                    System.out.println("Please input student ID: ");
                    String stuID = userinput.nextLine();
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.dropcourse(stuID,courseID,sems);
                    continue;
                }
                if(opt.equals("3")){
                    System.out.println(enrolmentsystem.getEnrolments());
                    continue;
                }
                if(opt.equals("4")){
                    System.out.println("Please input student ID: ");
                    String stuID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.getOne(stuID,sems);
                    continue;
                }
                if (opt.equals("5")){
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.getAll(courseID,sems);
                    continue;
                }
                continue;
            }

            // Exit System
            if(inputopt.equals("6")){
                System.out.println("Goodbye, Have a nice day");
                break;
            }
        }
    }
}

            // enrol to list with sem
//            enrolmentsystem.addenrolments("s3804825", "COSC2440", "2022A");
//            enrolmentsystem.addenrolments("s3804825", "FSN2001", "2022A");
//            enrolmentsystem.addenrolments("s3804826", "COSC2440", "2022A");
//            enrolmentsystem.addenrolments("s3804825", "ISYS2101", "2022B");
//            enrolmentsystem.addenrolments("s3804826", "ISYS2101", "2022B");
//            System.out.println(enrolmentsystem.getEnrolments());

            //Drop Course
//            enrolmentsystem.dropcourse("s3804825", "COSC2440", "2022A");
//            System.out.println(enrolmentsystem.getEnrolments());
//
//            // All Courses of a Student in a semester
//            enrolmentsystem.getOne("s3804825", "2022A");
//
//            // All Students in a Course
//            enrolmentsystem.getAll("COSC2440", "2022A");
//
