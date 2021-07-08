/*
 * User Input
 *
 *  System.out provides for standard output
 *     It contains methods such as println and print
 *
 *  System.in provides for standard input
 *     We can obtain data from the user
 */

/* Try manaually calling the package
 *
 * The only package that get's imported automatically in all programs is
 * java.lang for the Java language. This is the default package.
 */

//import java.util.Scanner; //Scanner doesn't live in java.lang so we have to manually import it 

public class KeyboardInput
{
  public static void main(String[] args)
  {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    String name;
    String city;
    String input;
    int    age;

    System.out.println("What is your name");
    name = keyboard.nextLine();

    System.out.println("What's your age?");
    age = keyboard.nextInt();

    // The nextInt() method above discards the newline character but leaves it in the stream
    // The nextLine method below will consume the new line character in the stream so we
    // can read user input normally. This will always happen when accepting numeric input from
    // the user.
    keyboard.nextLine(); 

    System.out.println("What city do you live in?");
    city = keyboard.nextLine();

    System.out.println("Hello, " + name);
    System.out.println("Your age is " + age);
    System.out.println("We can find you in " + city);

    System.out.print("Do you wanna play a game? (y/n): ");
    input = keyboard.nextLine().toLowerCase();

    if (input.equals("n"))
    {
      System.out.println("Aww foo");
      return;
    }

    System.out.print("Cool enter a number: ");
    age = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println(age + " x 2 = " + (age * 2));


    System.out.println("What's on your mind?");
    input = keyboard.nextLine();

    if (input.toUpperCase().equals("JAVA"))
      System.out.println("You read my mind man. Are you wizard or something?");
    else
      System.out.println("Cool beans bro! Cool beans.");
  } //end main
}
