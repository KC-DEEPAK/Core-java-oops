// Interface which is more useful then abstract class why means 
// In interface we use a when the methods are in abstract and interface is not a class 
// every method of interface which have a default public and abstract 
// In interface we only declare a what method should existes but not a code..
// The actual implementation is done in class that implements the interface..
// Interface which can supports a multiple inheritance..
interface A
{
  int sum =34;
  String name ="DEEPAK";//we can not change the values 

  void show();// abstract method declare ..
  void more();
}
class B implements A//by implements we not defined it also become a abstract class ..
{
  public void show()//abstract method implementation
  {
    System.out.println("Its a show method..");
  }
  public void more()
  {
    System.out.println("Its a more method..");
  }

}
public class Interface
{
  public static void main(String args[])
  {
    B obj = new B();
    obj.show();
    obj.more();
   // obj.name="guru"; we can not change the value of the final key word 
   System.out.println(A.sum + " : " + A.name);//its a static why because of without having a object we can
   //  we can call it..
  }
} 
