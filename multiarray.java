class Student{
    int rollno;
    String name;
    int marks;

}
public class multiarray {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.rollno =1;
        s1.name ="jagan";
        s1.marks = 78;
         Student s2 =new Student();
        s2.rollno =2;
        s2.name ="manas";
        s2.marks = 88;
         Student s3 =new Student();
        s3.rollno =3;
        s3.name ="mohit";
        s3.marks = 68;
        Student students[]=new Student[3];
        students[0]=s1;
         students[1]=s2;
          students[2]=s3;
        
        for (Student student : students) {
            System.out.println(student.rollno  + " : " + student.name + " : " + student.marks );
        }
    }
}
