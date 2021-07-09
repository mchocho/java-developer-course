/*
 * 3 Categories of Control statments
 *
 * i  ) Sequential (Sequence)
 *       These statements are executed in the order that they're 
 *       written in one right after the other.
 * ii ) Selection (Decision)
 * iii) Repetition (Loops)
 */


public class ControlStatementsIntro
{
  public static void main(String[] args)
  {
    //Sequential
    int age = 17;

    System.out.println("Your age is " + age);
  
    //Selection
    if (age >= 16)
    {
      System.out.println("You can drive!");
    }
    else
    {
      System.out.print("You cannot drive yet.");
    }

    System.out.println();  //Just need some space

    for (int i = 1; i <= age; i++)
    {
      System.out.println("Happy Birthday " + i);
    }

  }
}
