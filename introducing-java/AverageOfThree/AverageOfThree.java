public class AverageOfThree
{
  public static void main(String[] args)
  {
    double n1, n2, n3, avg;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
  
    System.out.print("Enter three numbers: ");

    n1 = scanner.nextDouble();
    n2 = scanner.nextDouble();
    n3 = scanner.nextDouble();

    scanner.nextLine();

    avg = (n1 + n2 + n3) / 3.0;
    System.out.println("Average is " + avg);
  }
}
