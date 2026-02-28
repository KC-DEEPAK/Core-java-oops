import tools.*;
//import tools.AdvCalc;// insted of importing two files we can just put a *..
//import tools.Calc;
import java.util.ArrayList;
import java.lang.*;
// we use * because of we have a flolder in that we have lot of files we want to access it we use a * 
public class Demo 
{
  public static void main(String args[])
  {
    ArrayList list = new ArrayList();
    Calc obj1=new Calc();
    AdvCalc obj = new AdvCalc();
    int r1 = obj.div(4,5);
    System.out.println(r1);
  }
}
// when we are move to other folder we just use a . symbols..
// * only means we can access only files not folders ..