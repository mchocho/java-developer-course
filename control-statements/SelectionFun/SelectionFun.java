/*
 * Selection Control Statements
 *    - if statement
 *    - if-else statement
 *    - switch statement
 */

public class SelectionFun
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int age;

    System.out.println("Welcome to the Turkey's Hot Tub.");

    System.out.print("Please enter your age: ");
    age = scanner.nextInt();

    if (age >= 18)
    {
      System.out.println("Here, have a beer.");
    }
    else if (age >= 16)
    {
      System.out.println("Here have a Sprite!");
      System.out.println("At least you can drive!");
    }
    else
    {
      System.out.println("Here have a Sprite!");
    }

    System.out.println("Thanks for coming to the Turkey's Hot Tub!");

  
  }
}
