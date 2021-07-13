public class Arrays
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++)
    {
      System.out.print("Enter a number: ");
      arr[i] = scanner.nextInt();
    }

    for (int value : arr)
    {
      System.out.println(value + " x 2 = " + (value * 2));
    }
  }
}
