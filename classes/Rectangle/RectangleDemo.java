public class RectangleDemo
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(5, 10);

    System.out.println(Rectangle.getNumRectangles());

    Rectangle r3;

    System.out.println("After r3 declared: " + Rectangle.getNumRectangles());

    r3 = new Rectangle(2.5, 4);

    System.out.println("After r3 instantiated: " + Rectangle.getNumRectangles());
    System.out.println("Area of r1: " + r1.area());
    System.out.println("Area of r2: " + r2.area());
    System.out.println("Area of r3: " + r3.area());

    System.out.println("Perimeter of r1: " + r1.perimeter());
    System.out.println("Perimeter of r2: " + r2.perimeter());
    System.out.println("Perimeter of r3: " + r3.perimeter());
  }
}
