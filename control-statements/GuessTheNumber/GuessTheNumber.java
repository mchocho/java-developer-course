public class GuessTheNumber
{
  public static void main(String[] args)
  {
    java.util.Random random = new java.util.Random();
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int number = random.nextInt(100) + 1;
    int count = 0;
    int guess;

    while(true)
    {
      count++;
      System.out.print("Guess the computer's number: ");
      guess = scanner.nextInt();

      if (guess == number)
      {
        System.out.println("Congratulations! You guess the number in " + count + " guesses! Thanks for playing!");
	break;
      }
      else if (guess < 1 || guess > 100)
        System.out.println("That was a was a wasted guess! Pick a number between 1 and 100, inclusive!");
      else if (guess < number)
	System.out.println("Your guess was to low.");
      else
	System.out.println("Your guess was to high.");
    }
  }
}
