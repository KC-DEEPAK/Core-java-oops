// We use a Wrapper class because of we have normal primitive datatype which int float double but when we 
// Apply the concept to object oriented we have a class of Integer,Double,Charecter,Boolean...
//Example ..
class Wrapper_class
{
  public static void main(String args[])
  {
    double n1 =5.6;
    Double n2=n1;
    System.out.println(n2);//we can do for all the primitive datatypes..


    int num =5;
    Integer num1 = num;//Auto-Boxing..means storing a primitive data to the wrapper class ..
    System.out.println(num1);

    int num2 = num1; //Auto-Unboxing which means taking a stored data from wrapper class ..
    System.out.println(num2);

    // in which integer have a another feature is parseint 
    // which means we stored a integer value in string that can converted to integer by ParseInt

    String str = "45";
    int num3 =Integer.parseInt(str);
    System.out.println(num3*3);
    
  }
}