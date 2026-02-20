// In which constructor are same as Method but in constructor we don't specify a datatype or return type ..
// Advantage of this with out calling constructor we can get o/p by creating a object it call when we create a constructor...
// also it assign a default value to unassigend values...
class Human
{
  private int age;
  private String name;

  public Human()// this is constructor block which helps 
  {
    System.out.println("Its a constructor block");
    age=34;
    name="yashwanth";// it also assign a default value to private value
  }

  public int getage()
  {
    return age;
  }

  public void setage(int age)
  {
    this.age=age;
  }

  public String getname()
  {
    return name;
  }
  
  public void setname(String name)
  {
    this.name=name;
  }

}
public class Constructor
{
  public static void main(String args[])
  {
    Human obj=new Human();// when we are create a object it call once in it ..
    System.out.println(obj.getname() + " : " + obj.getage());
  }
}