public class Test {
    public static void main(String args[]){

        StudentEnrolment student1= new StudentEnrolment();
        Course c1 = new Course("BP456","Futher",12);
        Course c2 = new Course("BP789","Programming",12);
//        System.out.println(student1.getSemesters());
//        System.out.println(student1.getCourses());
//        System.out.println(student1.getStudents());

        System.out.println(student1.coursecreator("2022A",c1));
        System.out.println(student1.coursecreator("2022A",c2));

//        System.out.println(student1.getCourseandsemeseter());
    }
}
