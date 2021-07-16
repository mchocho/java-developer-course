public class FunWith2DArrays
{
  public static void main(String[] args)
  {
     //2 row x 3 column
     int[][] my2DArray = new int[2][3];

     fill2DArray(my2DArray);

     print2DArray(my2DArray);

     System.out.println("\nAdding twice the fun...\n");

     twice2DArray(my2DArray);

     print2DArray(my2DArray);
  }

  public static void twice2DArray(int[][] twoDArr)
  {
    for (int i = 0; i < twoDArr.length; i++)
      for (int j = 0; j < twoDArr[i].length; j++)
        twoDArr[i][j] *= 2;
  }

  public static void fill2DArray(int[][] twoDArr)
  {
    java.util.Random rand = new java.util.Random();

    for (int i = 0; i < twoDArr.length; i++)
    {
      for (int j = 0; j < twoDArr[i].length; j++)
      {
        twoDArr[i][j] = rand.nextInt(100); // 0 ... 99 (inclusive)
      }
    } 
  }

  public static void print2DArray(int[][] twoDArr)
  {
    for (int[] arr : twoDArr)
    {
      for (int num : arr)
      {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
