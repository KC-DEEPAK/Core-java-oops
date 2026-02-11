// What is jagged array -> it means we know  how many rows are present but we don't know number of column
public class Jagged
{
  public static void main(String args[])
  {
    int nums[] []=new int[3][];//this called jagged array ..
    // creating a 3D array which means when we are creating we use..
    //int nums[][][]=new int[5][4][2];
    nums[0]=new int[3];
    nums[1]=new int[4];
    nums[2]=new int[2];

    for(int i=0;i<nums.length;i++)
    {
      for(int j=0;j<nums[i].length;j++)
      {
        nums[i][j]=(int)(Math.random()*10);//to generate a random numbers
      }
    }
    for(int n[] : nums)// this called a enhansed for loop..
    {
      for(int m:n)
      {
        System.out.print(m + " ");
      }
      System.out.println();
    }
  }
}