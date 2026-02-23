//WE are learning a Anonymous object creation which is similar to object creation but in this we are not use any 
// variable to store the object we directly create a new object..
//Example..
class Human
{
  public Human()
  {
    System.out.println("WE used to see a object..");
  }

  public void show()
  {
    System.out.println("it exacute a object...");
  }


}
class Anonymous_Object
{
  public static void main(String args[])
  {
   // Human obj =new Human();//this is normal object creation ..
   // we are now doing a Anonymous_object which we not use any variable to store it ..

    new Human().show();//this is called as Anonymous_object ...we also call a method  also..
    //obj.show();
  }
}
