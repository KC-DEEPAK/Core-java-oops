//Lambda Expression ->we use this only in Functional interface & its a short why to write a 
// Anonymus class without having a Function name ..
@FunctionalInterface 
interface A
{
  void show(int a,int b);
} 
public class Lambda_Expression
{
  public static void main(String args[])
  {
    // A obj =new A()
    // {
    //   public void show()
    //   {
    //     System.out.println("ITS IN Show Method..");
    //   }// It is out method of creating a  method and with its class or Anonmyous class..
    // };
    //BY Using a Lambda Expression We Can Redude the code into small & without function name..
   // A obj = () -> System.out.println("IS IN Show Method..");
    // this is by a redused code to print the lambda expression..
    //WE Can Also pass some parameters while calling it ..
    A obj =(a,b) -> System.out.println("IS IN Show Method.." + a + " & " +  b);
    obj.show(8,9);

  }
}
//Lambda Expression is which we can reduse the code and also we can pass the parameters in this..