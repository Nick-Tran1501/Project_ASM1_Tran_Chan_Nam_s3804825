public class Test {
    public static void main(String[] args){

        StudentEnrolment student1= new StudentEnrolment();
        Course c1 = new Course("BP456","Futher",12);
        Course c2 = new Course("BP789","Programming",12);

//create New Student or Course Sample
        student1.newone("Student","s3804827","Larry","09/01/2001");
        student1.newone("Student","s3804826","Pham Ly Thuy Vy","08/03/2001");
        student1.newone("Student","s3804825","Tran Chan Nam", "15/01/2001");

        // Current Course List Sample
        student1.newone("Course", "COSC2440", "Further Programming", "12");
        student1.newone("Course", "ISYS2101", "SEPM", "12");
        student1.newone("Course", "FSN2001", "Fashion", "12");
        student1.getSemesters();
        // 2022A Course Sample
        student1.coursecreator("2022A", "COSC2440");
        student1.coursecreator("2022A", "ISYS2101");
       // student1.coursecreator("2022A", "FSN2001");


        System.out.println(student1.getStudentsArrayList());
        System.out.println(student1.getCourseArrayList());
        // enrol sample
        student1.enroll("s3804825","ISYS2101");
        student1.enroll("s3804825","FSN2001");
        student1.enroll("s3804825","ISYS2101");

        //Enrolment

        student1.addenrolments("s3804825","ISYS2101","2022A");
        student1.addenrolments("s3804825","COSC2440","2022A");
        System.out.println(student1.getEnrolments());

        student1.dropcourse("s3804825","ISYS2101","2022A");
        System.out.println(student1.getEnrolments());

        student1.getAll("COSC2440","2022A");

        student1.getOne("s3804825","2022A");
    }
}
