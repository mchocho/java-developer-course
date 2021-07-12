public class DivisibleByThree
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int input;

    System.out.print("Please enter your integer: ");
    input = scanner.nextInt();

    if (input % 3 == 0)
      System.out.println(input + " is divisible by 3.");
    else
      System.out.println(input + " is not divisible by 3.");
  }
}
