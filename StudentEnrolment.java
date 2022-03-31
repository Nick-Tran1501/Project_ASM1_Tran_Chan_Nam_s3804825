import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentEnrolment {
    private Enrolment enrolment;
    private Student student;
    private Course course;
    private ArrayList<Student> studentsArraylist;
    private ArrayList<Course> courseArrayList;
    private ArrayList<String> semesters;
    private ArrayList<Enrolment> enrolments;
    private HashMap<String,ArrayList<Course>> courseandsemeseter;
    private HashMap<Course, ArrayList<Student>> studentlistinCourse;
    private HashMap<Student,HashMap<String,ArrayList<Course>>> semeseterenrol;

    public StudentEnrolment() {
        this.student = student;
        this.course = course;
        this.enrolment = enrolment;
        this.studentsArraylist = new ArrayList<>();
        this.courseArrayList = new ArrayList<Course>();
        this.semesters = new ArrayList<>();
        this.enrolments = new ArrayList<>();
        this.courseandsemeseter = new HashMap<>();
        this.studentlistinCourse = new HashMap<>();
        this.semeseterenrol = new HashMap<>();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Enrolment getEnrolment() {
        return enrolment;
    }

    public Enrolment setEnrolment(Enrolment enrolment) {

        return enrolment;
    }

    public ArrayList<Student> getStudentsArrayList() {
        return studentsArraylist;
    }

    public ArrayList<Student> setStudentsArrayList(ArrayList<Student> studentsArraylist){

        return studentsArraylist;
    }

    public ArrayList<Course> getCourseArrayList(){
        return courseArrayList;
    }

    public void setCourseArrayList(ArrayList<Course> courseArrayList) {
        this.courseArrayList = courseArrayList;
    }

    public ArrayList<String> getSemesters() {
        setSemesters();
        return semesters;
    }

    public ArrayList<String> setSemesters() {
        String semester[] = {"A","B","C"};
        int currentyear = Year.now().getValue();
        for(String sempriod: semester){
            String currentsemester = currentyear+ sempriod;
            semesters.add(currentsemester);
            ArrayList<Course> cour = new ArrayList<>();
            courseandsemeseter.put(currentsemester, cour);
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

    //add Course
    public ArrayList<Course> addcourse(Course course){
        courseArrayList.add(course);
        return courseArrayList;
    }
    public ArrayList<Student> addstudent(Student student){
            studentsArraylist.add(student);
            return studentsArraylist;
        }


    public boolean newone(String userinput, String optionnalID, String optionalName, String optionalvalue ){
        if (userinput.equals("Student")){
            for (Student student: studentsArraylist)
                if (student.getStudentID().equals(optionnalID)){
                    System.out.println("Exist");
                }
            Student student = new Student(optionnalID,optionalName,optionalvalue);
            studentsArraylist.add(student);
            return true;
        }

        if (userinput.equals("Course")){
            for (Course cour : courseArrayList)
                if (cour.getCourseID().equals(optionnalID)){
                    System.out.println("Exist");
                }
            Course course = new Course(optionnalID,optionalName,Integer. parseInt(optionalvalue));
            courseArrayList.add(course);

            return true;
        }
       return true;
    }

    public void coursecreator(String sem, String coursesInput){
        if(semesters.contains(sem)){
            for (Course cour : courseArrayList)
            if(cour.getCourseID().equals(coursesInput)){
                ArrayList<Course> couListTemp = courseandsemeseter.get(sem);
                for (Course copuTemp2 : couListTemp)
                if(copuTemp2.getCourseID().equals(coursesInput)){
                    System.out.println("Exited");
                    return;
                }
                couListTemp.add(cour);
                courseandsemeseter.put(sem, couListTemp);
                return;
            }
        }
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
            if (courseandsemeseter.containsKey(seminput)){
                    for (Course cour: courseandsemeseter.get(seminput))
                        if(cour.getCourseID().equals(courIDinput)){
                            for (Student stu: studentsArraylist)
                                if(stu.getStudentID().equals(stuIDinput)){
                                    for (Enrolment enrolment : enrolments)
                                    if (enrolment.getStudent().getStudentID().equals(stuIDinput) &&
                                    enrolment.getCourse().getCourseID().equals(courIDinput) &&
                                    enrolment.getSemester().equals(seminput)){
                                        System.out.println("Already Exist");
                                        return false;
                                    }
                                    Enrolment enrol= new Enrolment(stu,cour,seminput);
                                    enrolments.add(enrol);
                                    return true;
                                }
                        }
            }
        return true;
    }

    // remove
    public void dropcourse(String stuIDinput){

    }

    // update
    public void update(){

    }

    // getOne

    //getAll


// để làm Enrolment cần create Student với Courses, List of Courses in one semester


}


