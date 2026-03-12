//in the enumaration concept we used a enhansed for loop now we are try to use a if-else and switch statments 
// in the enumaration, yes it supports a enum both switch & if-else...
enum Condition
{
  Running,Success,Pending,Failed;
}
public class Enum_Condition
{
  public static void main(String args[])
  {
    Condition c = Condition.Success;
    // lets try if-else statments 1st ..
    // if(c == Condition.Running)//Yes its work for if-else statment 
    // {
    //   System.out.println("He Running");
    // }
    // else if(c == Condition.Success)
    // {
    //   System.out.println("He Success");
    // }
    // else if(c == Condition.Pending)
    // {
    //   System.out.println("He Pending");
    // }
    // else
    // {
    //   System.out.println("Done");
    // }
    switch(c)
    {
      case Running:
        System.out.println("By Running..");
        break;
      case Success:
        System.out.println("By Success..");
        break;
      case Pending:
        System.out.println("By Pending..");
        break;
      default:
        System.out.println("By Failed");
    }

  }
}