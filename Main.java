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
                    "Enrolment System Started:" +
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
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }

                }
                else if (createopt.equalsIgnoreCase("Course")) {
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input CourseName: ");
                    String courseName = userinput.nextLine();
                    System.out.println("Please input credit: ");
                    String coursecredit = userinput.nextLine();
                    enrolmentsystem.newone(createopt, courseID, courseName, coursecredit);
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
            }

            //Show Student, Course, Semester List
            else if(inputopt.equals("2")){
                System.out.println("1. Student List" +
                        "\n" +
                        "2.Course List" +
                        "\n" +
                        "3. Semester list");
                String input = userinput.nextLine();
                if (input.equals("1")){
                    System.out.println(enrolmentsystem.getStudentsArrayList());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
                if (input.equals("2")){
                    System.out.println(enrolmentsystem.getCourseArrayList());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
                if (input.equals("3")){
                    System.out.println(enrolmentsystem.getSemesters());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
            }

            //Add Course to Semester
            else if (inputopt.equals("3")){
                System.out.println("Please input semester: ");
                String sems = userinput.nextLine();
                System.out.println("Please input CourseID: ");
                String courseID = userinput.nextLine();
                enrolmentsystem.coursecreator(sems,courseID);
                System.out.println(enrolmentsystem.getCourseandsemeseter());
                System.out.println("Do you want to continue: " +
                        "\n" +
                        "1. Yes" +
                        "\n" +
                        "2. No");
                String contiopt = userinput.nextLine();
                if(contiopt.equals("1")){
                    continue;
                }
                else{
                    System.out.println("Goodbye, Have a nice day");
                    break;
                }
            }

            //Student enroll Courses
            else if(inputopt.equals("4")){
                System.out.println("Please input student ID: ");
                String stuID = userinput.nextLine();
                System.out.println("Please input CourseID: ");
                String courseID = userinput.nextLine();
                enrolmentsystem.enroll(stuID,courseID);

                System.out.println("Do you want to continue: " +
                        "\n" +
                        "1. Yes" +
                        "\n" +
                        "2. No");
                String contiopt = userinput.nextLine();
                if(contiopt.equals("1")){
                    continue;
                }
                else{
                    System.out.println("Goodbye, Have a nice day");
                    break;
                }
            }

            // Enrolment Add, delete, list
            else if(inputopt.equals("5")){
                System.out.println("1. Add to Enrolment list:" +
                        "\n" +
                        "2. Remove Enrolment: " +
                        "\n" +
                        "3. Show Enrolment: " +
                        "\n" +
                        "4. All Course of a Student in a semester: " +
                        "\n" +
                        "5. All Student in a Course: ");
                String opt = userinput.nextLine();
                if(opt.equals("1")){
                    System.out.println("Please input student ID: ");
                    String stuID = userinput.nextLine();
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.addenrolments(stuID,courseID,sems);
                    System.out.println(enrolmentsystem.getEnrolments());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }

                }
                else if(opt.equals("2")){
                    System.out.println("Please input student ID: ");
                    String stuID = userinput.nextLine();
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.dropcourse(stuID,courseID,sems);
                    System.out.println(enrolmentsystem.getEnrolments());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
                else if(opt.equals("3")){
                    System.out.println(enrolmentsystem.getEnrolments());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
                else if(opt.equals("4")){
                    System.out.println("Please input student ID: ");
                    String stuID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.getOne(stuID,sems);
                    System.out.println(enrolmentsystem.getEnrolments());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
                else if (opt.equals("5")){
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    enrolmentsystem.getAll(courseID,sems);
                    System.out.println(enrolmentsystem.getEnrolments());
                    System.out.println("Do you want to continue: " +
                            "\n" +
                            "1. Yes" +
                            "\n" +
                            "2. No");
                    String contiopt = userinput.nextLine();
                    if(contiopt.equals("1")){
                        continue;
                    }
                    else{
                        System.out.println("Goodbye, Have a nice day");
                        break;
                    }
                }
            }

            // Exit System
            if(inputopt.equals("6")){
                System.out.println("Goodbye, Have a nice day");
                break;
            }
        }
    }
}
