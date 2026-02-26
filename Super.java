// In super keyword we use to call the constructor of super class 
// it call the super class constructor (generally it call a default constructor ) If we pass a parameter it call  parameterized constructor..
class A
{
  public A()
  {
    super();// Super of A class is Object class is default..
    System.out.println("Its a A ");

  }
  public A(int n)
  {
    super();
    System.out.println("Its A int");

  }

}
class B extends A
{
  public B()
  {
    super();
    System.out.println("Its a B");

  }
  public B(int n)
  {
    //super(n);//we know its call A class paramitirized constructor..
    this();// see what is the use is when we call the parameter is n it call super class of parameter..
    System.out.println("Its B int");

  }
}
class Super
{
  public static void main(String args[])
  {
    B obj=new B(5);
  }
}
// When we want to call same class constructor then we use This key word..
// this key word execute of same class constructor 