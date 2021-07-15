public class MethodsDemo
{
  public static void main(String[] args)
  {
    printHello();
    printNumber(42);

    int result = giveMe10();
    System.out.println(result);

    result = addThese(3, 5);
    System.out.println(result);

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter a number: ");
    result = scanner.nextInt();

    printSquareRoot(result);
  } //main method

  /* Since main is static all other methods must be defined 
   * as static if we're to call them directly from main.
   * It means the methods belong to the class and not a 
   * specific object.
   */

  //void parameterless method
  public static void printHello()
  {
    System.out.println("Hello there!");
  }

  //void parameterized method
  public static void printNumber(int a)
  {
    System.out.println("The number is " + a);
  }

  //value-returning, parameterless method
  public static int giveMe10()
  {
    return 10;
  }

  //value-returning, parameterized method
  public static int addThese(int num1, int num2)
  {
    return (num1 + num2);
  }

  public static void printSquareRoot(int num)
  {
    int res = num * num;

    System.out.println("Square root of " + num + " is " + res);
  }
}
