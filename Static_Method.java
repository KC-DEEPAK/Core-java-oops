//As we know that Static method which have some features are..
//advantage is without creating a object we can call a method by using a class & inside a static method we can directly call the static variable 
//but non-static type we have to take a object refrence from a object..
class Mobile
{
  String brand;
  int price;
  static String name;

  void show()
  {
    System.out.println(brand + " :" + price + " : " + name );// this is normal method 
  }

  // we are creating a static method..
  public static void show1(Mobile obj)// this is static method
  {
    System.out.println(obj.brand + " :" + obj.price + " : " + name );
  }
}
class Static_Method
{
  public static void main(String args[])
  {
    Mobile mob_1 = new Mobile();
    mob_1.brand="Vivo";
    mob_1.price=11222;
    mob_1.name="Smartphone";

    Mobile mob_2 = new Mobile();
    mob_2.brand="Apple";
    mob_2.price=15000;
    mob_2.name="Smartphone";

    mob_1.show();
    mob_2.show();// this while calling a method of non-static method..
    //now calling a static method with out creating a object only by using a class..
    Mobile.show1(mob_1);// we are passing which object should call ...

  }
}