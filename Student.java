import java.util.ArrayList;
import java.util.HashSet;

public class Student {
    private String studentID;
    private String studentName;
    private String studentDOB;
    private ArrayList<Course> courseList;

    public Student(String studentID, String studentName, String studentDOB) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.courseList= new ArrayList<Course>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentDOB='" + studentDOB + '\'' +
                '}';
    }

}
