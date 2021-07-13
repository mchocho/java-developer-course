public class ArrayFun
{
  public static void main(String[] args)
  {
    int[] myArray;

    myArray = new int[10];

    myArray[0] = 42;
    myArray[1] = 12;
    myArray[2] = 5;
    myArray[3] = 17;
    myArray[4] = 20;

    /*
    for(int i = 0; i < myArray.length; i++)
    {
      System.out.println(myArray[i]);
    }
    */

    /*
     * Enhanced For Loop
     *   An alternative syntax for the for loop specifically for
     *   arrays
     */
    for(int num : myArray)
    {
      System.out.println(num);
    }

  }
}
