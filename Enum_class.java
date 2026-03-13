//Eum class which we can not extend by any other class we can create a method and we can create  an object 
// in the enum class which we can specify that it same as class but we not able to extend it..
enum Laptop
{
  Mackbook(2000),Xps,Surface(1500),Thinkpad(1800);
  //we want to access the price then we create a one variable its is private...
  private int price;
//if the constructor price is not given then we use a default constructor ..
  private Laptop()
  {
    price=400;//this is default constructor which we use when they not given a value of constuctor..
    System.out.println("This is default Constructor " + this.name());
  }

  private Laptop(int price)//this is parameterised constructor let see how many time it run..
  {
    this.price=price;
    System.out.println("This is parameterised Constructor  " + this.name());
    //this not give Xps because of it is not a parameterised constructor ..
  } 
  //we want to get or set the constructor then we use a geters and seters to access the data ..
  public int getprice()
  {
    return price;
  }
  public void setprice(int price)
  {
    this.price=price;
  }
}
public class Enum_class
{
  public static void main(String args[])
  {
    Laptop[] lap = Laptop.values();

    for(Laptop l : lap)
    {
      System.out.println(l + ":" + l.getprice());
    }
  }
}
//Yes we have seen that enum is  a class but which we can not extends to another class ..
 