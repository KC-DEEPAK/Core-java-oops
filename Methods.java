// IN JAVA  method is like a Behavior of that particular class ...
// Example When we are talking about a Computer its main function or Behavior is doing a particular given task or we can play songs 

class Computer
{
  // we use a public that  we can use that method anywhere in class ...
  // we use a int or void based on the condition we use a void when we are not returning anything from method..
  // we use a int where we are going to return somthing from that method..
  // we can pass a value in the method ..

  public void play_music()
  {
    System.out.println("MUsic is playing ...");
  }// in this we are not returning anything that why we use a void..
  
  public int Programs(int count)
  {
    int result=count +1;
    return result;
  }// this is returning abecause we use a int in it..

  public String My_pen(int num)
  {
    if(num>=10)
    {
      return "pen";
    }
    else
    {
      return "Nothing";
    }
  }

}

// we use a main class where we are going to create a object ..
 class Methods
 {
  public static void main(String args[])
  {
    // we want to create a object first..
    Computer com =new Computer();
    com.play_music();// we are not storing this because we not returning anything in this ..
    int result=com.Programs(90);// we are storing this because we are returning by int..
    String str=com.My_pen(1);// this also storing we return string...
    System.out.println(result);
    System.out.println(str);
  }
 }