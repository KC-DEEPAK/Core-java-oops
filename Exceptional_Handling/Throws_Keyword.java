//In the throws the method is not going to handle the try catch block it is going handover 
// to another  block by saying you are responsible to handle the exception in this type of 
// condition we use the throws keyword ..
class A
{
  public void show() throws ClassNotFoundException
  {
    Class.forName("Throw_Keyword");
  }
}
public class Throws_Keyword
{
  static
  {
    System.out.println("class is not found.");
  }
  public static void main(String args[])
  {
    A obj = new A();
    try
    {
      obj.show();
    }
    catch(ClassNotFoundException e)
    {
      e.printStackTrace();
      System.out.println("Class Is Not Found .." + e);
    }
  }
}