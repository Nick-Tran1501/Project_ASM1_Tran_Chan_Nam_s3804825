import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentEnrolment {
    private Enrolment enrolment;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<String> semesters;
    private ArrayList<Enrolment> enrolments;
    private HashMap<String,ArrayList<Course>> courseandsemeseter;
    private HashMap<Course, ArrayList<Student>> studentlistinCourse;
    private HashMap<Student,HashMap<String,ArrayList<Course>>> semeseterenrol;

    public StudentEnrolment() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.semesters = new ArrayList<>();
        this.enrolments = new ArrayList<>();
        this.courseandsemeseter = new HashMap<>();
        this.studentlistinCourse = new HashMap<>();
        this.semeseterenrol = new HashMap<>();
    }

    public Enrolment getEnrolment() {
        return enrolment;
    }

    public Enrolment setEnrolment(Enrolment enrolment) {

        return enrolment;
    }

    public ArrayList<Student> getStudents() {
        setStudents();
        return students;
    }

    public ArrayList<Student> setStudents(){
        Student student1 = new Student("s3804825","Tran Chan Nam", "15/01/2001");
        Student student2 = new Student("s3804826","Pham Ly Thuy Vy","08/03/2001");
        Student student3 = new Student("s3804827","Larry","09/01/2001");
            students.add(student1);
            students.add(student2);
            students.add(student3);
        return students;
    }

    public ArrayList<Course> getCourses(){
        setCourses();
        return courses;
    }

    public ArrayList<Course> setCourses() {
        Course c1 = new Course("COSC2440", "Further Programming", 12);
        Course c2 = new Course("ISYS2101", "SEPM", 12);
        Course c3 = new Course("FSN2001", "Fashion", 12);
        // add Courses
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        return courses;
    }

    public ArrayList<String> getSemesters() {
        setSemesters();
        return semesters;
    }

    public ArrayList<String> setSemesters() {
        String semester[] = {"A","B","C"};
        int year = Year.now().getValue();
        for(String sem: semester){
            String sems = year+ sem;
            semesters.add(sems);
        }
        return semesters;
    }

    public ArrayList<Enrolment> getEnrolments() {
        setEnrolments();
        return enrolments;
    }

    public ArrayList<Enrolment> setEnrolments() {

        return enrolments;
    }

    public HashMap<String, ArrayList<Course>> getCourseandsemeseter() {
        setCourseandsemeseter();
        return courseandsemeseter;
    }

    public HashMap<String, ArrayList<Course>> setCourseandsemeseter() {
        ArrayList<Course> cour = getCourses();

        courseandsemeseter.put("2022A",cour);

        return courseandsemeseter;
    }

    public HashMap<Course, ArrayList<Student>> getStudentlistinCourse() {
        return studentlistinCourse;
    }

    public void setStudentlistinCourse(HashMap<Course, ArrayList<Student>> studentlistinCourse) {
        this.studentlistinCourse = studentlistinCourse;
    }

    public HashMap<Student, HashMap<String, ArrayList<Course>>> getSemeseterenrol() {
        setSemeseterenrol();
        return semeseterenrol;
    }

    public HashMap<Student, HashMap<String, ArrayList<Course>>>  setSemeseterenrol() {
        //check all student variables, course variables, semester
        HashMap<String, ArrayList<Course>> semandcourse = new HashMap<>();
        Student student = new Student("s123456","Nam","15/01/2001");

        return semeseterenrol;
    }

    public boolean newone(String userinput, String optionnalID, String optionalName, String optionalvalue ){
        if (userinput == "Student"){
            System.out.println("StudentID, Student Name, DOB: ");
            Student student = new Student(optionnalID,optionalName,optionalvalue);
            students.add(student);
            System.out.println(students);
        }

        if (userinput == "Course"){
            System.out.println("CourseID, CourseName, Credit: ");
            Course course = new Course(optionnalID,optionalName,Integer. parseInt(optionalvalue));
            courses.add(course);
        }
       return true;
    }

    public HashMap<String, ArrayList<Course>> coursecreator(String sem, Course coursesL){
        for( String listsem: getSemesters()){
            if(listsem.contains(sem)){
                for (Course cour: courses){
                    if(cour.getCourseID().equals(coursesL.getCourseID()) && cour.getCourseName().equals(coursesL.getCourseName()) && cour.getCourseID().equals(coursesL.getCourseID())){
                        courses.add(coursesL);
                        ArrayList<Course> newcour = courseandsemeseter.get(sem);
                        if(newcour.contains(coursesL)){
                            return courseandsemeseter;
                        }
                        newcour.add(coursesL);
                        courseandsemeseter.put(sem,newcour);
                    }
                }
            }
        }
        return courseandsemeseter;
    }

    public ArrayList<Enrolment> addenrolmentlist(Enrolment enrolment){
        for(Enrolment enrols: enrolments)
        if(enrols.getStudent().getStudentID().equals(enrolment.getStudent().getStudentID()) &&
                enrols.getCourse().getCourseID().equals(enrolment.getCourse().getCourseID()) &&
                enrols.getSemester().equals(enrolment.getSemester())
        ){
            System.out.println("Already");
            return enrolments;
        }
        enrolments.add(enrolment);
        System.out.println("Successfully, Thank you");
        return enrolments;
    }

    public boolean addenrolments(String stuIDinput, String courIDinput, String seminput){
        for(String sems: semesters){
            if(seminput.equals(sems)){
                for (Course courID : courseandsemeseter.get(sems)) {
                    if (courIDinput.equals(courID.getCourseID())) {
                        for (Student stuID : students) {
                            if (stuIDinput.equals(stuID.getStudentID())) {
                                Enrolment enrol = new Enrolment(stuID,courID,sems);
                                for(Enrolment enrols: enrolments)
                                    if(enrols.getStudent().getStudentID().equals(enrolment.getStudent().getStudentID()) &&
                                            enrols.getCourse().getCourseID().equals(enrolment.getCourse().getCourseID()) &&
                                            enrols.getSemester().equals(enrolment.getSemester())
                                    ){
                                        System.out.println("Already");
                                    }
                                addenrolmentlist(enrol);
                                return true;
                            }
                        }
                    }
                }
            }



        }
        return true;
    }

    // remove
    public void dropcourse(String stuIDinput){
    for (Student stuID: students){
        if(stuIDinput.equals(stuID.getStudentID())){


        }
    }
    }

    // update
    public void update(){

    }

    // getOne

    //getAll


// để làm Enrolment cần create Student với Courses, List of Courses in one semester


}


