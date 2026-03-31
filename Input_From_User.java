//we learnt all the factors in java but in java when we take a input from user ..
// In JAVA We Use A 2 Method to take a input from user 1) Buffered reader 2) Scanner 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Input_From_User
{
  public static void main(String args[]) throws IOException
  {
    System.out.println("Enter the Number / Name ..");

    InputStreamReader in = new InputStreamReader(System.in); 
    BufferedReader bf = new BufferedReader(in);

    int num = Integer.parseInt(bf.readLine());//this one is to take a input in the from of Integer
    String  name = bf.readLine();//This one is for String or charceter ...
    System.out.println(name);
    //This is used in older version of the java.....
    Scanner sc = new Scanner(System.in);
    //String name = sc.nextLine();//This one is used to scan a input string ..
    int num = sc.nextInt();
    System.out.println(num);
  }
}