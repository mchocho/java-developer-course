/*
 * Wrapper Classes
 *    - Unlike ArrayLists, which can only work with reference types
 *           Wrapper classes work with primitive types
 *    - The 8 wrapper classes are:
 *       + Byte, Short, Integer, Long
 *       + Float, Double
 *       + Character, Boolean
 */

public class WrapperFun
{
  public static void main(String[] args)
  {
    java.util.ArrayList<Integer> numberList = new java.util.ArrayList<>();
    String someValue = "450";
    String pi = "3.14159";
    int numericValue;
    double dPi;

    numberList.add(42);
    numberList.add(88);

    for (int i = 0; i < numberList.size(); i++)
    {
      System.out.println(numberList.get(i));
    }

    numericValue = Integer.parseInt(someValue);
    numericValue += 10;

    System.out.println(numericValue);

    dPi = Double.parseDouble(pi);
    System.out.println(dPi);
  }
}
