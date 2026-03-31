// In Java We Use a Finally Keyword because of when try block is executes it will throw an exception to the 
// catch block it will execute if there is exception but in finally keyword is  used if there is a exception 
// Or not have a exception the finally block is going to execute 
//EXAMPLE ...
public class Finally_Key
{
  public static void main(String args[])
  {
     int i=0;
     int j=0;
    try
    {
       j = 12 / i;
    }
    catch(ArithmeticException e)
    {
      System.out.println("ExceptionHandling..");
    }
    finally
    {
      System.out.println("Finally block is executed ");
    }
  }
}