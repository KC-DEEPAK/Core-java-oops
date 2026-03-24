//In Exception Types We Know that Runtime error in that we can Overcome by handling that errors
//1) By Using a Try & catch we Can Handling The Exception ..
public class Exception_handling
{
  public static void main(String args[])
  {
    //int i=2;//It Shows Like This Exception in thread "main" java.lang.ArithmeticException: / by zero
       // at Exception_handling.main(Exception_handling.java:8)
    // int div = 16/i;
    // System.out.println(div);
   //its stop the execution it not going to execute next statment.
    // System.out.println("After the div");

    //To handle this we use a try & catch method..
    //try ->which means it will try is that block is going to execute or not 
    int i =0;
    int div = 0;
    try 
    {
      div =16/i;
    }//we handle the Execption by if try show exception then catch block is going to executed ..
    catch(Exception e)
    {
      System.out.println("Somthing went Wrong..");
    }
    System.out.println(div);
    System.out.println("After catch method..");
  }
}