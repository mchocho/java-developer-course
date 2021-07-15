public class MethodOverloading
{
  public static void main(String[] args)
  {
    int result = getResult(5); 
    String res;
    System.out.println(result);

    result = getResult(5, 4);
    System.out.println(result);

    result = getResult(5, "12");
    System.out.println(result);

    res = getResult("James", "Bond");
    System.out.println("The name's Bond, " + res + "!");
    
  }

  public static int getResult(int num)
  {
    return (num * 2);
  }

  public static int getResult(int num1, int num2)
  {
    return (num1 * num2);
  }

  public static int getResult(int num1, String value)
  {
     return (num1 * Integer.parseInt(value));
  }

  public static String getResult(String str1, String str2)
  {
    return (str1 + " " + str2);
  }
}
