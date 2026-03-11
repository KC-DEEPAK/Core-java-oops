//Enum->which means a Enumeration which is a special type used to represent a fixed set of constants..
//its help make programs more readable ,safe,and organized..

enum Day
{
  Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
public class Enum
{
  public static void main(String args[])
  {
    Day[] today = Day.values();//to retrive all the enum value we use a values 
    for(Day d : today)//enhansed for loop we used ..
    {
      System.out.println(d + " : " + d.ordinal());//ordinal we used to get a index value of each enum value..
    }
    //System.out.println(today);
  }
}