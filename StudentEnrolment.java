import java.util.ArrayList;
import java.util.HashMap;

public class StudentEnrolment {
    private ArrayList<Student> studentE;
        private ArrayList<Course> courseE;
        private String semester;
        private Student students;
        private Course courses;
        private HashMap<String, HashMap> listEnrolment;


    public StudentEnrolment(HashMap<String, HashMap> listEnrolment) {
        this.listEnrolment = listEnrolment;
    }

    public StudentEnrolment(String semester, Student students, Course courses) {


        this.semester = semester;
        this.students = students;
        this.courses = courses;
    }

    public StudentEnrolment(){

        this.studentE = new ArrayList<Student>();
        this.courseE =  new ArrayList<Course>();
    }

    public ArrayList<Student> getStudentE() {
        return studentE;
    }

    public void setStudentE(ArrayList<Student> studentE) {
        this.studentE = studentE;
    }

    public ArrayList<Course> getCourseE() {
        return courseE;
    }

    public void setCourseE(ArrayList<Course> courseE) {
        this.courseE = courseE;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }


    public HashMap<String, HashMap> getListEnrolment() {
        return listEnrolment;
    }

    public void setListEnrolment(HashMap<String, HashMap> listEnrolment) {
        this.listEnrolment = listEnrolment;
    }

    public void addStudent(Student students){

        if(studentE.contains(students)){
            System.out.println("say hello");
        }
        else{
            studentE.add(students);
        }
    }

    public void addCourse(Course courses){
        if(courseE.contains(courses)){
            System.out.println("say hello");
        }
        else{
            courseE.add(courses);
        }
    }

    public void update(Student students, Course courses){
        HashMap<Course, ArrayList<Student>> enrol= new HashMap<>();
       if(courses.getStudentList().contains(students)){
           System.out.println("False");
       }
        else{
            courses.getStudentList().add(students);
//           System.out.println("success");
//           System.out.println(courses+"="+courses.getStudentList());
           enrol.put(courses,courses.getStudentList());
           System.out.println(enrol);
       }

        //add student list
        //add course list
        // Enrolment list

    }
    @Override
    public String toString() {
        return "StudentEnrolment{" +
                "student=" + studentE + "\n"+
                ", course=" + courseE +
                ", semester='" + semester + '\'' +
                '}';
    }



}




