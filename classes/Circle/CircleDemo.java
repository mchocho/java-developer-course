public class CircleDemo
{
  public static void main(String[] args)
  {
  
    Circle myCircle = new Circle(12.0);
    Circle test = new Circle(12.75);
    Circle anotherCircle = new Circle();

    printCircleDetails(myCircle);
    System.out.println();
    printCircleDetails(anotherCircle);
    System.out.println();
    printCircleDetails(test);
  }

  public static void printCircleDetails(Circle circle)
  {
    System.out.println("r = " + circle.getRadius());
    System.out.println("C = " + String.format("%.2f", circle.circumference()));
    System.out.println("A = " + String.format("%.2f", circle.area()));
    System.out.println();
  }
}
