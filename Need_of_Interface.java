// When we say the need of interface ..
interface Computer
{
   void code();
}
class Desktop implements Computer
{
  public void code()
  {
    System.out.println("coding ,Faster..");
  }
}
class Laptop implements Computer
{
  public void code()
  {
    System.out.println("Coding.. ,Slower ..");
  }
}
class Developer
{
  public void devApp(Computer lap)
  {
    lap.code();
  }
}
public class Need_of_Interface
{
  public static void main(String args[])
  {
    Computer lap= new Laptop();
    Computer desk= new Desktop();
    Developer dev = new Developer();
    dev.devApp(lap);


  }
}