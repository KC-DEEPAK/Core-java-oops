// In inheritance which that we are going to inheritance some charecter from my father or mother 
// we are using inheritance concept in java which we will ..
class Calc
{
  public int add(int n1,int n2)
  {
    return n1 + n2;
  }
  public int sub(int n1,int n2)
  {
    return n1 - n2;

  }
}
class Adcal extends Calc
{
  public int mul(int n1,int n2)
  {
    return n1 * n2;
  }// When we extends a two class we are calling as single inheritance ..

}
class Veracal extends Adcal
{
  public double power(int n1,int n2)
  {
    return Math.pow(n1,n2);
  }
}// This is called as Multi level Inheritance 
public class Inheritance
{
  public static void main(String args[])
  {
    Veracal obj=new Veracal();

    int r1=obj.add(4,5);
    int r2=obj.sub(10,5);
    int r3=obj.mul(4,5);
    double r4=obj.power(4,5);

    System.out.println(r1 + " " + r2 + " " + r3 + " "+ r4);

  }
}
//Multi level Inheritance -> Having a multiple class charecter are store in one class and we create a object to that...
//Single means -> only two class..