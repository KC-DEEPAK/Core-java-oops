//we are see normal class which perform a by non-static , inner class which use a static keyword to perform a operation
// When we use the inner class we can do without static also
class Computer
{
  int n1 = 23;
  public void Big()
  {
    System.out.println("Its Big method..");
  }
  static class Laptop
    {
      public void small()
      {
        System.out.println("Its Small method ..");
      }
    }
}
class Inner_Class
{
  public static void main(String args[])
  {
    Computer obj = new Computer();
    obj.Big();

    Computer.Laptop obj1 = new Computer.Laptop();// when we use a concept static then the syntax is this 
    // when we not use a static then
    //Computer.Laptop obj1 = obj. new Laptop(); // when we not use a static then this syntax is work..
    obj1.small(); 

  }
}