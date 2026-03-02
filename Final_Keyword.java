// Final keyword is which we can used for 1)Variable 2)Class 3)Methods ..
// By variable onces we assign  a value we not able to change it by Final key word..
// By use of final in Class we not able to Inherit the super class 
// By the use of final in method method overriding is not possible ..

final class Calc //when we inherit from super class it is final we not able to access that class ..
{
  public final void show()
  {
    System.out.println("Its by a deepak..");
  }

  public void add(int n1,int n2)
  {
    System.out.println(n1+n2);
  }
}
// class AdvCalc extends Calc //when we inherit from super class it is final we not able to access that class
// {
//   public void show1()//show() in AdvCalc cannot override show() in Calc
//   {
//     System.out.println("its by guru..");
//   }
// }

public class Final_Keyword
{
  public static void main(String args[])
  {
   // int result=23;
    //result=34;//int the normal case we can change the value of result 
    //but when we use a final in variable we can't change it ..
    //final int result=45;//we got a error like this cannot assign avalue to final variable result..
    //result=56;
    //System.out.println(result);
    AdvCalc obj = new AdvCalc();
    obj.show();
    obj.add(3,4);
  }
}
