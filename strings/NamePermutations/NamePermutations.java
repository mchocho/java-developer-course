public class NamePermutations
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    java.util.ArrayList<String> firstNames = new java.util.ArrayList<String>();
    java.util.ArrayList<String> lastNames = new java.util.ArrayList<String>();
    String input;
    String first;
    String last;
    int indexOfSpace;

    for (int i = 0; i < 5; i++)
    {
      System.out.print("Enter a first and last name: ");
      input = scanner.nextLine();

      indexOfSpace = input.indexOf(' ');

      first = input.substring(0, indexOfSpace);
      last = input.substring(indexOfSpace + 1);

      firstNames.add(first);
      lastNames.add(last);
    }

    for (int i = 0; i < 5; i++)
    {
      for (int j = 0; j < 5; j++)
      {
        System.out.println(firstNames.get(i) + " " + lastNames.get(j));
      }
    }

  }
}
