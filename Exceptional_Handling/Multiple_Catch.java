//we are seen a catch block which will execute when the try block is shows an exeception in java 
// we have a different kind of catch blocks in that we have to use a different catch block 
public class Multiple_Catch
{
  public static void main(String args[])
  {
    int arr[] = new int[5];
    int i =2;
    int j=0;
    String name =null;
    try
    {
      int result = 12/i;//This is Arithematic Exception..
      System.out.println(arr[2]);//This is ArrayIndexoutofbound..
      System.out.println(name.length());//Null pointer exception..
    }
    catch(ArrayIndexOutOfBoundsException ie)
    {
      System.out.println("It is Array Index Out of bound.." + ie);
    }
    catch(ArithmeticException ae)
    {
      System.out.println("Its an Arithematic Exception.." + ae);
    }
    catch(NullPointerException e)
    {
      System.out.println("pls enter any String  We can find the length.." );
    }

  }
}
//We HAVE A MULTIPLE CATCH block because of we through an exact error of the exception..