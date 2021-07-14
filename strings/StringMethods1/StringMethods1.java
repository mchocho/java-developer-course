public class StringMethods1
{
  public static void main(String[] args)
  {
    String name = "The Incredible Hulk";
    String name2 = "The Incredible Hulk";
    String name3 = "Bruce Banner";
    String myName = "The ZUMA";

    for(int i = 0; i < name.length(); i++)
    {
      System.out.print(name.charAt(i) + " ");
    }

    System.out.println();

    if (name.equals(name2))
    {
      System.out.println("Names are equal.");
    }
    else
    {
      System.out.println("Names aren't equal.");
    }

    /*
     * compareTo() returns an int
     *   - If the return value equals 0 then the 2 names are the same
     *   - If the return value is greater than 0 the name you called it on
     *          is lexically greater than the arguement
     *   - If the return value is less than 0 that means the name you called it
     *          on is less than the arguement.
     */
    if (name.compareTo(name3) > 0)
    {
      System.out.println("name > name3 ");
    }
    else
    {
      System.out.println("name <= name3");
    }

    if (myName.compareTo(name) > 0)
    {
      System.out.println(myName + " > " + name);
    }
    else
    {
      System.out.println(myName + " < " + name);
    }
  }
}
