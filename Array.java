//In array we this because of storing a  multiple value  in a single variable we use array..
// In array we can store a value by 2 types by static or by Dynamic ...

// BY Static -> we known the value ..
// BY Dynamic -> we don't know the value ..

public class Array
{
  public static void main(String args[])
  {
    // By static ..
    int num[]={5,7,8,9};// in this we know the value ..
    // to change the value..
    num[1]=3;
    System.out.println(num[1]);

    // BY DYNAMIC..
    int num_1[]=new int[4];// this is syntax of storing  a dynamic value..
    num_1[0]=77;
    num_1[1]=44;
    num_1[2]=33;
    num_1[3]=22;
    //num_1[4]=1;
    // we want to print all the value so we use a for loop ..
    for(int i=0; i<=3;i++)
    {
      System.out.println(num_1[i]);
    }
    // Find the sum of element using array ..

    int num_2[]={1,2,3,4,5,6};
    int sum=0;
    for(int i=0;i<num_2.length;i++)
    {
      //int sum=0;
      sum= sum+ num_2[i];
      
    }
    System.out.println(sum);

  }
}