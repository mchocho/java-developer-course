public class NameParser
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String name;
    String first;
    String last;
    int delIndex;

    System.out.print("Enter your first and last name: ");
    name = scanner.nextLine();

    delIndex = name.indexOf(' ');

    if (delIndex != -1)
    {
      first = name.substring(0, delIndex);
      last = name.substring(delIndex + 1);

      System.out.println(first.toUpperCase() + " " + last.toLowerCase());
    }
  }
}
