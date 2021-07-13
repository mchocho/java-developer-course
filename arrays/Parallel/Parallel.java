public class Parallel
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    java.util.ArrayList<String> nameList = new java.util.ArrayList<String>();
    int[] ageList = new int[5];  

    for (int i = 0; i < 5; i++)
    {
      System.out.print("Enter a name: ");
      nameList.add(scanner.nextLine());

      System.out.print("Enter " + nameList.get(i) + "'s age: ");
      ageList[i] = scanner.nextInt();
      scanner.nextLine();
      System.out.println("");
    }

    System.out.println("");
    for (int i = 0; i < 5; i++)
    {
      System.out.println(nameList.get(i) + " is " + ageList[i] + " years old");
    }
  }
}
