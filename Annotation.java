//Annotation which are that helps to finding a buges in programing ..
class A
{
  public void ThisIsShow()
  {
    System.out.println("Which belongs to A class..");
  }
}
class B extends A
{
  @Override// this used that it should show the error ..
  public void ThisIsShow()
  {
    System.out.println("Which belongs to B class..");
  }
}
class Annotation
{
  public static void main(String args[] )
  {
    B obj = new B();
    obj.ThisIsShow();

  }//we expected output is B class should show output which is not showing means it has a bug let see 
  // We use a concept called Annotation which identify the bug in methods or class 
}