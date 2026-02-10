// int method overloading means that same method name but parameters are diffrernt 

class Calculator
{
  public int add(int n1, int n2 ,int n3)// method name same but parameter are diffrent...
  {
    return n1 + n2 + n3;
  }
  public int add(int n1,int n2)// method name are same but have 2 parameter
  {
    return n1 + n2;
  }
  public double add(double n1,double n2) // same parameter but diffrent type...
  {
    return n1 + n2;
  }
}
public class Overloading
{
  public static void main (String args[])
  {
    Calculator cal =new Calculator();
    int result_0 = cal.add(5,6,7);
    int result_1=cal.add(3,9);
    double result_2=cal.add(44.44,67.89);
    System.out.println(result_0);
    System.out.println(result_1);
    System.out.println(result_2);
  }
}