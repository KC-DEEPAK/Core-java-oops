public class Multi_dimensional
{
  public static void main(String args[])
  {
    int nums[][] =new int[3][4];

    for(int i=0;i<3;i++)
    {
      for(int j=0;j<4;j++)
      {
        nums[i][j]=(int)(Math.random() * 100);// we use a Math.random() to generate a random numbers it generate a inthe form of decimal value we 
        // we have to type caste the double to integer..
        System.out.print(nums[i][j]+" ");
      }
      System.out.println("");

    }
    System.out.println("-------------------------------------------------");
    // we can use a Enhansed for loop..for execute this ..
    for(int n[]: nums)
    {
      for(int m:n)
      {
        System.out.print(m +" ");// this is by enhansed for loop
      }
      System.out.println("");
    }
  }
}