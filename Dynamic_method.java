//Polymorphism->poly->many,,morphism->behaviour..
// In Polymorphism which have a two types are 1) Runtime ->eg (Method overloading ) , 2)compile time(Method Overriding) 
// Dynamic method Dispatch we use it because of we don't know what is going to be the output ..
// its runtime basiclly 
class A
{
  public void show()
  {
    System.out.println("It is A method");
  }
}
class B
{
  public void show()
  {
    System.out.println("It is B method");
  }
}
class C
{
  public void show()
  {
    System.out.println("It is C method");
  }
}
public class Dynamic_method
{
  public static void main(String args[])
  {
    A obj = new A();
    obj.show();// in this we are creating a 3 object but the method 

    B obj1 = new B();
    obj1.show();

    C obj2 = new C();
    obj2.show();

  }
}