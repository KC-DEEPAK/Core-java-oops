// we are learning a Static key word  if i want that variable is common to all we are using a static which specify that common to all..

class Phons
{
  int Prize;
  static String name;//we use a static the name which is common to all that why we use this keyword..
  String Brand;

  void common()
  {
    System.out.println(Brand +" :"+ Prize + " :"+ name +" ");
  }
}

public class Static
{
  public static void main(String args[])
  {
    Phons pho_1 = new Phons();
    pho_1.Prize=3000;
    Phons.name="Smart_phone";
    pho_1.Brand="Apple";

   // pho_1.name="floadable phone";
    Phons pho_2 = new Phons();
    pho_2.Prize=45000;
    Phons.name="Smart_phone";
    pho_2.Brand="Vivo";

    pho_1.name="floadable phone";
    pho_1.common();
    pho_2.common();
    //System.out.println(pho_1.Brand +" :"+ pho_1.Prize + " ");
  }
}