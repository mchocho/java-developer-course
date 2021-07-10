public class Fraternity
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int age;
    char gender;

    System.out.print("Please enter your gender: ");
    gender = scanner.next().charAt(0);

    if (gender != 'M' && gender != 'm')
    {
      System.out.println("You must be a male to join this fraternity.");
      return;
    }

    System.out.print("Please enter your age: ");
    age = scanner.nextInt();

    if (age < 19)
    {
      System.out.println("You must be at least 19 years or older to join this fraterniy!");
      return;
    }

    System.out.println("Welcome home boys! Here's a beer.");
  }
}
