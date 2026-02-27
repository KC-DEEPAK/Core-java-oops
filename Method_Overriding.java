// In the method overriding we are override some methods over other by which we have a two class and have two methods 
// in which we create a object of B its overrides a method A..
class Calc
{
  public int add(int n1,int n2)
  {
    return n1 + n2;
  }

}
class AdvCalc extends Calc
{
  public int add(int n1,int n2)
  {

    return n1 + n2 + 1;// this called as a method overriding add metheod which overrides a Calc add method because of we create a object of class AdvCalc..
    
  }
}
public class Method_Overriding
{
  public static void main(String args[])
  {
    AdvCalc obj = new  AdvCalc();
    int r1 = obj.add(6,6);
    System.out.println(r1);
  }
}