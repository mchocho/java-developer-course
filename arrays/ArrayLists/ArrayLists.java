public class ArrayLists
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
    int next;

    while(true)
    {
      System.out.print("Enter a number (negative number to exit): ");
      next = scanner.nextInt();

      if (next < 0)
        break;

      list.add(next);
    }

    for (int i = list.size() - 1; i > -1; i--)
    {
      System.out.println(list.get(i));
    }

  }
}
