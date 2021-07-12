public class LearningPackages
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int total = 0;
    int base;
    int pack;
    int costPerCourse;
    int courses;
    int included;

    System.out.print("Select a learning package (1, 2 or 3): ");
    pack = scanner.nextInt();

    if (pack > 0 && pack < 4)
    {
      System.out.print("How many courses did you enroll in this month: ");
      courses = scanner.nextInt();

      switch(pack)
      {
        case 1:
	  base = 10;
	  costPerCourse = 6;
	  included = 2;
	  break;
	case 2:
	  base = 12;
	  costPerCourse = 4;
	  included = 4;
	  break;
	default:
	  base = 15;
	  costPerCourse = 3;
	  included = 6;
      }

      if (courses > included)
        total = base + (costPerCourse * (courses - included));
      else
	total = base;

      System.out.println("Total cost is $" + total);
    }
  }
}
