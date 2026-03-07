// We are using a two concept together are Abstract and Anonymous inner class ..
abstract class A
{
  public  abstract void show();//we just declare it
  public  abstract void copy();
  //we have two abstract class are show and copy we only declere them not defined 
}
// To defined abstract method  we have to create a another class
// By using a Anonymous inner class we can achive with out a seperate class 
class Abstract_Anonymous
{
  public static void main(String args[])
  {
    A obj = new A()// this is called as Anonymous inner class which helps to not create a another class ..
    {
      public void show()// we defined in the while creating an object..
      {
        System.out.println("This is show method..");

      }
      public void copy()
      {
        System.out.println("This is copy method..");
      }
    };
    obj.show();
    obj.copy();
  }
} 