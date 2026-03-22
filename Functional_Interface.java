//Functional Interface IN which it as a only one method and use to specify it ..
//Example..
@FunctionalInterface
interface A
{//WE use a @FunctionalInterface to specify it as only one method 
  void show();
  //void show1();//when we create another method it show a bug ..
}
class B implements A
{
  public void show()
  {
    System.out.println("Its in show method..");
  }
}
class Functional_Interface
{
  public static void main(String args[])
  {
    B obj = new B();
    obj.show();
  }
}