import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentL;
    private Student students;

   public StudentList(){
       this.studentL = new ArrayList<Student>();
   }

    public ArrayList<Student> getStudentL() {
        return studentL;
    }


    public void setStudentL(ArrayList<Student> studentL) {
        this.studentL = studentL;
    }
    public void addStudent(Student students){
        if(studentL.contains(students)){
            System.out.println("say hello");
        }
        else{
            studentL.add(students);
        }

    }





    @Override
    public String toString() {
        return "StudentList{"+
                "studentL=" + studentL +
                '}';
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public void addtofile() throws FileNotFoundException {
        FileWriter studentfile = null;
        try {
            studentfile = new FileWriter("SLfiles.csv");
            studentfile.write(getStudentL().toString());
            studentfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
