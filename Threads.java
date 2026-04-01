//Why we uses a Thread Because of it Perform multiple tasks at the same time 
//It also imporve the performance (Especially on Multi-core CPUs)
//Which also give a Better User experience .. 
class A extends Thread
{
  public void run()
  {
    for(int i=1; i<100; i++)
    {
       System.out.println("Hii");
       try
       {
         Thread.sleep(50); // this is used to sleep the thread for 100 milliseconds;
       }
       catch(InterruptedException e)
       {
         System.out.println(e);
       }


    }
  }
}
class B extends Thread
{
  public void run()
  {
    for(int i=1; i<100; i++)
    {
      System.out.println("Hello");
      try
      {
        Thread.sleep(50); // this is used to sleep the thread for 100 milliseconds;
      }
      catch(InterruptedException e)
      {
        System.out.println(e);
      }
    }
  }
}
public class Threads
{
  public static void main(String args[])
  {
    A obj = new A();
    B obj1 = new B();
    obj.start();
    try
    {
      Thread.sleep(10); // this is used to sleep the main thread for 10 milliseconds;
    }
    catch(InterruptedException e)
    {
      System.out.println(e);
    }
    obj1.start();
  }
}
// we are useing a thread because of assume that we are playing a cricket online game in that we have a 
// multiple thread are fans are chering and two teams and bowling and bating simentanouesly as to be done 
// in this example we are try to print the one hii and one hello we can do this by using a threads 
