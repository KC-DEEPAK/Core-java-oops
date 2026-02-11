// By creating a object we use a diffrent class ..
class Student
{
  int rool_no;
  int marks;
  String name;

}
class Object_Array
{
  public static void main(String args[])
  {
     Student student_s1=new Student();
     student_s1.rool_no=23;
     student_s1.marks=76;
     student_s1.name="Deepak";

     Student student_s2=new Student();
     student_s2.rool_no=29;
     student_s2.marks=65;
     student_s2.name="Puni";

     Student student_s3=new Student();
     student_s3.rool_no=46;
     student_s3.marks=89;
     student_s3.name="Vishnu";

     Student Students[]=new Student[3];// we are create a object to class 
     Students[0]=student_s1;
     Students[1]=student_s2;
     Students[2]=student_s3;

     for(int i=0;i<Students.length;i++)
     {
      System.out.println(Students[i].name + " USN is  " + Students[i].rool_no);
      System.out.println(Students[i].name + " Marks is  " + Students[i].marks);
     }
  }
}