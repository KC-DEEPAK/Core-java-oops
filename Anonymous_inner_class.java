//In the Anonymous inner class Anonymous means  -> with out name ..in that inner class 
// we know the concept called a method overriding in that we override the other superclass in this we not 
// going to create a another class we directly change in while creating a object ..
class A
{
  public void show()
  {
    System.out.println("Its a show method..");
  }
  // In this we not going to create a another class 
}
class Anonymous_inner_class
{
  public static void main(String args[])
  {
    A obj = new A()// this simple where we create a object inside we create a anonymous class ->inner class
    {
      public void show()
      {
        System.out.println("Its a new show method..");
      }
    };
    obj.show();
  }
}