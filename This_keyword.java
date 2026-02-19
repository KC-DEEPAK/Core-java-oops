// We use this it is referance variable that refers to the current object of class...
class Human
{
  private int age=34;
  private String name="Deepak";

  public int getage()
  {
    return age;
  }

  public void setage(int age)
  {
    this.age=age;// we use this key word when instence variable is taken from same class and it refers to current object
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
class This_keyword
{
  public static void main(String args[])
  {
    Human obj=new Human();
    obj.setage(45);
    obj.setname("prakash");

    System.out.println(obj.getname() + " : " + obj.getage());
  }
}