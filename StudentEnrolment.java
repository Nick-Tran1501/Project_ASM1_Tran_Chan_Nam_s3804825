import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentEnrolment {
        private ArrayList<Student> studentE;
        private ArrayList<Course> courseE;
        private String semester;
        private Student students;
        private Course courses;

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


    @Override
    public String toString() {
        return "StudentEnrolment{" +
                "student=" + studentE +
                ", course=" + courseE +
                ", semester='" + semester + '\'' +
                '}';
    }

//    public static void main(String args[]) {
//        Course c1 = new Course("C001", "SADI", 12);
//        Course c2 = new Course("C002", "Further", 12);
//        Student s1 = new Student("s001", "minh", "15/01/2001");
//        Student s2 = new Student("s002", "ben", "15/01/2001");
//        List<String> studentEnroll = new ArrayList<>();
//        List<String> studentCourse = new ArrayList<>();
//        StudentEnrolment student1= new StudentEnrolment();
//
//        if (c1.enroll(s1)) {
//            System.out.println("Successfully enrolled");
////
//        } else {
//            System.out.println("Already in there");
//        }
//        if (c1.enroll(s2)) {
//            System.out.println("Successfully enrolled");
////
//        } else {
//            System.out.println("Already in there");
//        }
//
//        if (c2.enroll(s1)) {
//            System.out.println("Successfully enrolled");
//
//        } else {
//            System.out.println("Already in there");
//        }
//
//        studentEnroll.add(s1.getCourseList().toString());
//        studentCourse.add(c1.getStudentList().toString());
//        ........
////        System.out.println(c1.getStudentList().toString());
//        student1.studentE.add(s1);
//        student1.courseE.add(c1);
//        student1.semester = "2021A";
//        System.out.println(student1.toString());
//        System.out.println(s1.toString() + "\n" + studentEnroll);
//        System.out.println(studentCourse);
//    }
}




