public class StringMethods2
{
  public static void main(String[] args)
  {
    String name = "The Incredible Hulk";
    String upper = name.toUpperCase();
    String lower = name.toLowerCase();

    int whereIsH = name.indexOf('H');

    String lastName = name.substring(15);

    System.out.println("upper is " + upper);
    System.out.println("lower is " + lower);
    System.out.println("H is at index " + whereIsH);
    System.out.println("Last name is " + lastName);
  }
}
