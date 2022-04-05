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

        label:
        while (true) {
            Scanner userinput = new Scanner(System.in);
            System.out.println("""
                    Hello Academic Assistant
                    Enrolment System Started:
                    1.Create Student or Course\s
                    2.Show Student, Course, Semester List
                    3.Add Course to Semester
                    4.Student enroll Courses
                    5.Update Enrolment list
                    6.Exit""");

            String inputopt = userinput.nextLine();
            // Create Student or Course
            switch (inputopt) {
                case "1" -> {
                    System.out.println("Please input Student or Course: ");
                    String createopt = userinput.nextLine();
                    if (createopt.equalsIgnoreCase("Student")) {
                        System.out.println("Please input StudenID: ");
                        String studentID = userinput.nextLine();
                        System.out.println("Please input Name: ");
                        String studentName = userinput.nextLine();
                        System.out.println("Please input DOB: ");
                        String studentDOB = userinput.nextLine();
                        enrolmentsystem.newone(createopt, studentID, studentName, studentDOB);
                        System.out.println("Do you want to continue: \n1. Yes\n2. No");
                        String contiopt = userinput.nextLine();
                        if (contiopt.equals("1")) {
                            continue;
                        } else {
                            System.out.println("Goodbye, Have a nice day");
                            break label;
                        }

                    } else if (createopt.equalsIgnoreCase("Course")) {
                        System.out.println("Please input CourseID: ");
                        String courseID = userinput.nextLine();
                        System.out.println("Please input CourseName: ");
                        String courseName = userinput.nextLine();
                        System.out.println("Please input credit: ");
                        String coursecredit = userinput.nextLine();
                        enrolmentsystem.newone(createopt, courseID, courseName, coursecredit);
                        System.out.println("Do you want to continue: \n1. Yes\n2. No");
                        String contiopt = userinput.nextLine();
                        if (contiopt.equals("1")) {
                            continue;
                        } else {
                            System.out.println("Goodbye, Have a nice day");
                            break label;
                        }
                    }
                }

                //Show Student, Course, Semester List
                case "2" -> {
                    System.out.println("1. Student List\n2.Course List\n3. Semester list");
                    String input = userinput.nextLine();
                    if (input.equals("1")) {
                        System.out.println(enrolmentsystem.getStudentsArrayList());
                        System.out.println("Do you want to continue: \n1. Yes\n2. No");
                        String contiopt = userinput.nextLine();
                        if (contiopt.equals("1")) {
                            continue;
                        } else {
                            System.out.println("Goodbye, Have a nice day");
                            break label;
                        }
                    }
                    if (input.equals("2")) {
                        System.out.println(enrolmentsystem.getCourseArrayList());
                        System.out.println("Do you want to continue: \n1. Yes\n2. No");
                        String contiopt = userinput.nextLine();
                        if (contiopt.equals("1")) {
                            continue;
                        } else {
                            System.out.println("Goodbye, Have a nice day");
                            break label;
                        }
                    }
                    if (input.equals("3")) {
                        System.out.println(enrolmentsystem.getSemesters());
                        System.out.println("Do you want to continue: \n1. Yes\n2. No");
                        String contiopt = userinput.nextLine();
                        if (contiopt.equals("1")) {
                            continue;
                        } else {
                            System.out.println("Goodbye, Have a nice day");
                            break label;
                        }
                    }
                }

                //Add Course to Semester
                case "3" -> {
                    System.out.println("Please input semester: ");
                    String sems = userinput.nextLine();
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    enrolmentsystem.coursecreator(sems, courseID);
                    System.out.println(enrolmentsystem.getCourseandsemeseter());
                    System.out.println("Do you want to continue: \n1. Yes\n2. No");
                    String contiopt = userinput.nextLine();
                    if (contiopt.equals("1")) {
                        continue;
                    } else {
                        System.out.println("Goodbye, Have a nice day");
                        break label;
                    }
                }


                //Student enroll Courses
                case "4" -> {
                    System.out.println("Please input student ID: ");
                    String stuID = userinput.nextLine();
                    System.out.println("Please input CourseID: ");
                    String courseID = userinput.nextLine();
                    enrolmentsystem.enroll(stuID, courseID);

                    System.out.println("Do you want to continue: \n1. Yes\n2. No");
                    String contiopt = userinput.nextLine();
                    if (contiopt.equals("1")) {
                        continue;
                    } else {
                        System.out.println("Goodbye, Have a nice day");
                        break label;
                    }
                }


                // Enrolment Add, delete, list
                case "5" -> {
                    System.out.println("""
                            1. Add to Enrolment list:
                            2. Remove Enrolment:\s
                            3. Show Enrolment:\s
                            4. All Course of a Student in a semester:\s
                            5. All Student in a Course:\s""");
                    String opt = userinput.nextLine();
                    switch (opt) {
                        case "1" -> {
                            System.out.println("Please input student ID: ");
                            String stuID = userinput.nextLine();
                            System.out.println("Please input CourseID: ");
                            String courseID = userinput.nextLine();
                            System.out.println("Please input semester: ");
                            String sems = userinput.nextLine();
                            enrolmentsystem.addenrolments(stuID, courseID, sems);
                            System.out.println(enrolmentsystem.getEnrolments());
                            System.out.println("Do you want to continue: \n1. Yes\n2. No");
                            String contiopt = userinput.nextLine();
                            if (contiopt.equals("1")) {
                                continue;
                            } else {
                                System.out.println("Goodbye, Have a nice day");
                                break label;
                            }

                        }
                        case "2" -> {
                            System.out.println("Please input student ID: ");
                            String stuID = userinput.nextLine();
                            System.out.println("Please input CourseID: ");
                            String courseID = userinput.nextLine();
                            System.out.println("Please input semester: ");
                            String sems = userinput.nextLine();
                            enrolmentsystem.dropcourse(stuID, courseID, sems);
                            System.out.println(enrolmentsystem.getEnrolments());
                            System.out.println("Do you want to continue: \n1. Yes\n2. No");
                            String contiopt = userinput.nextLine();
                            if (contiopt.equals("1")) {
                                continue;
                            } else {
                                System.out.println("Goodbye, Have a nice day");
                                break label;
                            }
                        }
                        case "3" -> {
                            System.out.println(enrolmentsystem.getEnrolments());
                            System.out.println("Do you want to continue: \n1. Yes\n2. No");
                            String contiopt = userinput.nextLine();
                            if (contiopt.equals("1")) {
                                continue;
                            } else {
                                System.out.println("Goodbye, Have a nice day");
                                break label;
                            }
                        }
                        case "4" -> {
                            System.out.println("Please input student ID: ");
                            String stuID = userinput.nextLine();
                            System.out.println("Please input semester: ");
                            String sems = userinput.nextLine();
                            enrolmentsystem.getOne(stuID, sems);
                            System.out.println(enrolmentsystem.getEnrolments());
                            System.out.println("Do you want to continue: \n1. Yes\n2. No");
                            String contiopt = userinput.nextLine();
                            if (contiopt.equals("1")) {
                                continue;
                            } else {
                                System.out.println("Goodbye, Have a nice day");
                                break label;
                            }
                        }
                        case "5" -> {
                            System.out.println("Please input CourseID: ");
                            String courseID = userinput.nextLine();
                            System.out.println("Please input semester: ");
                            String sems = userinput.nextLine();
                            enrolmentsystem.getAll(courseID, sems);
                            System.out.println(enrolmentsystem.getEnrolments());
                            System.out.println("Do you want to continue: \n1. Yes\n2. No");
                            String contiopt = userinput.nextLine();
                            if (contiopt.equals("1")) {
                                continue;
                            } else {
                                System.out.println("Goodbye, Have a nice day");
                                break label;
                            }
                        }
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
