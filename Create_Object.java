// In java creating a object is a most importent while creating a object we come across ..
// to create a object main class is importent to create a object syntax is ..
//SYNTAX-> class_name object_name=new class_name();...
class Calculator
{
  //creating a metheod..
  public int add(int n1,int n2)// this one is metheods
  {
    int r=n1+n2;
     return r;
  }
}
public class Create_Object
{
  public static void main(String a[])
  {
    int num1=4;
    int num2=5;

    // Creating a object ..
    Calculator calc =new Calculator();// this is called as creating a object 

    int result= calc.add(num1,num2);// calling a metheod 

    System.out.println(result);

  }
}
// we have another question is that create a two object create a class Rectangle with length and breadth
// two objects are rectangle1(),and ,rectangle2()...
class Rectangle
{
  public int area(int length,int breadth)
  {
    int area=length * breadth;
    return area;
  }
}
class Create_Object
{
  public static void main(String args[])
  {
    // creating a object..
    Rectangle rec_1=new Rectangle();
    Rectangle rec_2=new Rectangle();

    int result_1= rec_1.area(10,20);
    int result_2=rec_2.area(4,7);

    System.out.println("The areae of Rectangle_1 is =>"+ result_1 +"...");
    System.out.println("The area of Rectangle_2 is =>"+ result_2 +"...");
    

  }
}