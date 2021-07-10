/*
 * Testing switch statements
 */

public class GradeFun
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    char grade;

    System.out.print("Enter a grade: ");
    //grade = scanner.next().toUpperCase().charAt(0);
    grade = scanner.next().charAt(0);

    switch (grade)
    {
      case 'A':
      case 'a':
        System.out.println("Great job!");
	break;
      case 'B':
      case 'b':
	System.out.println("Good job.");
	break;
      case 'C':
      case 'c':
	System.out.println("You can do better.");
	break;
      case 'D':
      case 'd':
	System.out.println("Your're getting pretty close to failing");
	break;
      case 'F':
      case 'f':
	System.out.println("You're failing the course!");
	break;
      default:
	System.out.println("You have entered an invalid grade.");
    }
  }
}
