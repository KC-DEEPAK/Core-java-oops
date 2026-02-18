// Static Block which is used for to declear a static variable 
class Mobile
{
  String brand;
  int price;
  static String name;

  static
  {
    name ="SmartPhone";
    System.out.println("in the static block..");
  }

  public Mobile()//constructor
  {
    brand =" ";
    price=200;
    System.out.println("in constructor");
  }
  public void show()
  {
    System.out.println(brand + " : "+ price +" : "+ name);

  }
}
public class Static_Block
{
  public static void main(String args[])// throws ClassNotFoundException
  {
    //Class.forName("Mobile");// to run sattic block only ..
   // Class.forName(className:"Mobile");
    Mobile obj1 =new Mobile();
    // obj1.brand="Apple";
    // obj1.price=1500;
    // Mobile.name="smartphone";

    Mobile obj2=new Mobile();
    Mobile obj3=new Mobile();
  }
}