//WE have seen a Lambda expression & yes we know we can pass a  Parameter while passing
// In this code we can see Working of return type in Lambda expression..
@FunctionalInterface
interface A
{
  int show(int i,int j);
}
public class Lambda_return
{
  public static void main(String args[])
  {
    // A obj = new A()
    // {
    //   public int show (int i,int j)
    //   {
    //     return i + j ; 
    //   }
    // }; yes it is Working but we can do this in lambda expression ...
    A obj = (i,j) ->  i + j;//it working only for single line ..
    int result = obj.show(4,5);
    System.out.println(result);
  }// We Can Remove the return also 
}