//NOW we are back to the concept of Upcasting & Downcasting we know casting the when we convert a double to int
//we can do the casting in Example-> double n=4.5;
                                    //   int i = (int) n;..
// public static void main(String args[])
  // {
  //   double n = 5.6;
  //   //int i= (int)n;// this is called as Type casting 
  //   int j=n;
  //   System.out.println(j);
  // }
  //Same type we have a Upcasting & Downcasting 
class A
{
  public void show1()
  {
    System.out.println("Its a class A ..");

  }

} 
class B extends A
{
  public void show2()
  {
    System.out.println("Its a class B..");
  }

}
class Upcasting_Downcasting
{
  public static void main(String args[])
  {
    A obj = (A) new B(); //WE are doing refrence of A and object of B..
    obj.show1();// This is called as Upcasting 

    B obj1 = (B) obj;// This is called as a Downcasting ..which the 
    obj1.show2();
  }
}
// Upcasting -> Which means Object created  to  subclass and and calling a superclass method..
//Downcasting -> which means Object is created to subclass but we not able to access it then we use a this 
// converting  a object to the refrence..
