// Encapsulation means which it protect a data inside a class we can access it only by using a method called get and set 
// get which is used to get a data from protected data .. which set which is used for set means change a data in a protected data..
// we are using a private key word to protected data from outside ...
class Human
{
  private int age=23;
  private String name="Deepak..";//we use a private key word to protect a personal data.. 

  public int getage()// we use get or method to acess the data from protection
  {
    return age;
  }

  public void  setage(int a)// this is for set or changing a data from protection..
  {
    age=a;
  }

  public String getName()
  {
    return name;
  }
  public void  setName(String n)
  {
    name=n;
  }
}

public class Encapsulation
{
  public static void main(String args[])
  {
    Human obj=new Human();
    obj.setage(45);
    obj.setName("Puni");
    
    System.out.println(obj.getName() + " :" + obj.getage() );
  }
}