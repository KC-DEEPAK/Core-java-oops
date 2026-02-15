// String Buffer is which we can mutable a String .. which it provide a space of 16 Character  of space..
public class String_Buffer
{
  public static void main(String args[])
  {
    StringBuffer sb =new StringBuffer("Deepak kc ");
    sb.append(" kumar");
    sb.insert(0,"write");// we used this to insert a value at front or given index..
    sb.deleteCharAt(2);// we use a deletecharat we use to delete the word 
    sb.setLength(30);
    System.out.println(sb);// in which string buffer consists of 16 character..


  }
}