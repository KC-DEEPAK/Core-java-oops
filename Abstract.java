// in abstract we are going to do the following operation

abstract class Car
{
  public abstract void drive();//if we want to declare a method then we should use a abstract key word

  public abstract void speed();// we just declare the method

  public void playMusic()
  {
    System.out.println("play Music..");
  }
}
abstract class WagonR extends Car//when WagonR extends a car it should impliment a drive method 
{
  public void drive()
  {
    System.out.println("it is WagonR Car Driving..");
  }
  // public void speed()
  // {
  //   System.out.println("It 100 Km/hr");
  // } // if we not able to create a method of car class then we made a class into a abstract
}
class UpWagonR extends WagonR
{
  public void speed()
  {
    System.out.println("Full speed ..");
  }
}
public class Abstract
{
  public static void main(String args[])
  {
    Car obj =new UpWagonR();//we not able to create a object to the abstract class 
    obj.drive();
    obj.speed();
    obj.playMusic();
  }
}// through Abstract class we can do that take real world example that car is there but but don't know 
// how to drive then another class says or company comes we train how todrive company must takes the 
// method from car owner ....