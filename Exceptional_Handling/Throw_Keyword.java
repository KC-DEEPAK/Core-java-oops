//In the code we try to handle the exception while we are printing a we just give a Suggestion 
//To user the its is an Arithematic error but in we use a throw in which it apply some condition
//to simplly giveing a Zero as output we are showing a output as 1..
public class Throw_Keyword
{
  public static void main(String args[])
  {
    int i=20;
    int j=0;
    try
    {
      j = 4/i;//when we divide a 4/20 -> it show 0 but we want zero as output 
      if(j==0)
      {
        throw new ArithmeticException();
      } //throw which helps if the block contain a exception 
      //is there it will throw to  catch and it print default..
    }
    catch(ArithmeticException e)
    {
      j=4/1;
      System.out.println("It is a default output ..");
    }
    System.out.println(j);
    
  }
}