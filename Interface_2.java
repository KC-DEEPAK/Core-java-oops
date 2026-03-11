//We know that interface features we have a additional feature 
// we can implements a multiple interface to one class ...

//point to remember is when we use in inheritence ..
//we use extends to class to class ..
//we use implements to interface to class ..
//we use extends between a interface to interface..
interface A
{
  void show();
} 
interface B
{
  void show1();
}
interface D extends B
{

}
class C implements A,D//we can implements a multiple interface...
{
  public void show()
  {
    System.out.println("its a show method..");

  }
  public void show1()
  {
    System.out.println("its a show1 method..");

  }
}
public class Interface_2
{
  public static void main(String args[])
  {
    C obj = new C();
    obj.show();
    obj.show1(); 
  }
}