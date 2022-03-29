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

    public ArrayList<Student> setStudents() {
        Scanner studentinput= new Scanner(System.in);
            System.out.println("StudentID, Full Name, Your DOB:");
            Student student = new Student(studentinput.next(), studentinput.next(), studentinput.next());
            students.add(student);
            return students;
    }

    public ArrayList<Course> getCourses(){
        setCourses();
        return courses;
    }

    public ArrayList<Course> setCourses() {
        Course c1 = new Course("BP456","Futher",12);
        Course c2 = new Course("BP789","Programming",12);
        Course c3= new Course("BP123","Software",12);
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
        return courseandsemeseter;
    }

    public void setCourseandsemeseter(HashMap<String, ArrayList<Course>> courseandsemeseter) {
        this.courseandsemeseter = courseandsemeseter;
    }

    public HashMap<Course, ArrayList<Student>> getStudentlistinCourse() {
        return studentlistinCourse;
    }

    public void setStudentlistinCourse(HashMap<Course, ArrayList<Student>> studentlistinCourse) {
        this.studentlistinCourse = studentlistinCourse;
    }

    public HashMap<Student, HashMap<String, ArrayList<Course>>> getSemeseterenrol() {

        return semeseterenrol;
    }

    public void setSemeseterenrol(HashMap<Student, HashMap<String, ArrayList<Course>>> semeseterenrol) {
        this.semeseterenrol = semeseterenrol;
    }

    public void addcoursetosemester(){

    }

// để làm Enrolment cần create Student với Courses, List of Course in one semester
















}

//    private ArrayList<Student> studentE;
//    private ArrayList<Course> courseE;
//    private String semester;
//    private Student students;
//    private Course courses;
//    private HashMap<Student, HashMap<String, ArrayList<Course>>> semesterenrolment;
//    private HashMap<String, HashMap> listEnrolment;
//
//    public HashMap<Student, HashMap<String, ArrayList<Course>>> getSemesterenrolment() {
//        return semesterenrolment;
//    }
//
//    public void setSemesterenrolment(HashMap<Student, HashMap<String, ArrayList<Course>>> semesterenrolment) {
//        this.semesterenrolment = semesterenrolment;
//    }
//
//
//
//
//    public StudentEnrolment(HashMap<String, HashMap> listEnrolment) {
//        this.listEnrolment = listEnrolment;
//    }
//
//    public StudentEnrolment(String semester, Student students, Course courses) {
//
//
//        this.semester = semester;
//        this.students = students;
//        this.courses = courses;
//    }
//
//    public StudentEnrolment(){
//
//        this.studentE = new ArrayList<Student>();
//        this.courseE =  new ArrayList<Course>();
//        this.semesterenrolment = new HashMap<>();
//    }
//
//    public ArrayList<Student> getStudentE() {
//        return studentE;
//    }
//
//    public void setStudentE(ArrayList<Student> studentE) {
//        this.studentE = studentE;
//    }
//
//    public ArrayList<Course> getCourseE() {
//        return courseE;
//    }
//
//    public void setCourseE(ArrayList<Course> courseE) {
//        this.courseE = courseE;
//    }
//
//    public String getSemester() {
//        return semester;
//    }
//
//    public void setSemester(String semester) {
//        this.semester = semester;
//    }
//
//    public Student getStudents() {
//        return students;
//    }
//
//    public void setStudents(Student students) {
//        this.students = students;
//    }
//
//    public Course getCourses() {
//        return courses;
//    }
//
//    public void setCourses(Course courses) {
//        this.courses = courses;
//    }
//
//
//    public HashMap<String, HashMap> getListEnrolment() {
//        return listEnrolment;
//    }
//
//    public void setListEnrolment(HashMap<String, HashMap> listEnrolment) {
//        this.listEnrolment = listEnrolment;
//    }
//
//    public void addStudent(Student students){
//
//        if(studentE.contains(students)){
//            System.out.println("say hello");
//        }
//        else{
//            studentE.add(students);
//        }
//    }
//
//    public void addCourse(Course courses){
//        if(courseE.contains(courses)){
//            System.out.println("say hello");
//        }
//        else{
//            courseE.add(courses);
//        }
//    }
//
//    public void update(String setSemester, ArrayList<Course> courseE){
//        courseE = new ArrayList<>();
//        HashMap<String, ArrayList<Course>> enrol= new HashMap<>();
////       if(courses.getStudentList().contains(students)){
////       }
////        else{
////            courses.getStudentList().add(students);
//////           System.out.println(courses+"="+courses.getStudentList());
////
////
////       }
//        enrol.put(setSemester,courseE);
//        System.out.println(enrol);
////        this.semester="2021A";
////        listEnrolment.put(getSemester(),enrol);
//
//
//        //add student list
//        //add course list
//        // Enrolment list
//    }
//
//    @Override
//    public String toString() {
//        return "StudentEnrolment{" +
//                "student=" + studentE + "\n"+
//                ", course=" + courseE +
//                ", semester='" + semester + '\'' +
//                '}';
//    }
//
//



