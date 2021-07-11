/*
 * Repetition Control Statements
 *   - while loop
 *   - do-while loop
 *   - for loop
 */


public class RepetitionFun
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int count = 0;
    int count2 = 15;
    int input;

    //Priming read
    System.out.println("Enter a non-negative integer");
    System.out.println("Or negative to exit");
    input = scanner.nextInt();

    while (input >= 0)
    {
      System.out.println(input);

      System.out.println("Enter a non-negative integer");
      System.out.println("Or negative to exit");
      input = scanner.nextInt();
    }

    System.out.println("Merci");

    while (count < 10)
    {
      System.out.println("While " + count);
      count++;
    }

    do
    {
      System.out.println("Doing while: " + count2);
      count2++;
    }
    while(count2 < 10);

    for (int i = 0; i < 10; i++)
    {
      System.out.println("For: " + i);
    }

  }
}
