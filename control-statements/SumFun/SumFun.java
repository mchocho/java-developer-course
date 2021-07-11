public class SumFun
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int sum = 0;
    int tmp = 0;

    while (true)
    {
      System.out.print("Please enter a non-negative number: ");
      tmp = scanner.nextInt();

      if (tmp < 0)
        break;
      sum += tmp;
    }

    System.out.println("Total sum: " + sum);
  }
}
