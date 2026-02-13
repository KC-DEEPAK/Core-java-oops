// we are working with enhansed for loop and in this we are not going to assign a value or increment the value direct we are printing...
class Student
{
  int marks;
  int rool_no;
  String name;
}
class Enhanced
{
  public static void main(String args[])
  {
    Student stu=new Student(); 
    stu.marks=20;
    stu.rool_no=7;
    stu.name="puni";

    Student[] Students= new Student[1];
    Students[0]=stu;

    for(Student n : Students)
    {
      System.out.println(n.name + " : " + n.marks );
    }
  }
}
// class Enhanced
// {
//   public static void main(String args[])
//   {
//     int nums[]=new int[3];

//     nums[0]=4;
//     nums[1]=5;
//     nums[2]=6;

//     for(int n : nums)
//     {
//       System.out.println(n);
//     }
//   }
// }