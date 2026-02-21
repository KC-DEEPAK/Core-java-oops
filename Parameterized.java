//we are doing a default or parameterized constructor 
// in which default constructor which do not accept any parameters 
class Human
{
  private int age;
  private String name;

  public Human()// this is called as default constructor...
  {
    age=12;
    name="johan";
  }
  
  public Human(int age,String name)// this one is called as parameterized constructor..
  {
    this.age=age;
    this.name=name;
  }

  public int getage()
  {
    return age;
  }

  public void setage(int age)
  {
    this.age=age;
  }

  public String getname()
  {
    return name;
  }

  public void setname(String name)
  {
    this.name=name;
  }
}
class Parameterized
{
  public static void main(String args[])
  {
    Human obj=new Human();
    Human obj1=new Human(34,"chethan");

    System.out.println(obj.getname() + " : " + obj.getage());
    System.out.println(obj1.getname() + " : " + obj1.getage());


  }
}