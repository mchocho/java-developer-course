public class Rectangle
{
  public double length;
  public double width;  

  private static int numRectangles;

  //No argument constructor
  public Rectangle()
  {
    //Calling the constructor below. Really cool!
    this(1.0, 1.0);
  }

  public Rectangle(double length, double width)
  {
    this.length = length;
    this.width = width;
    numRectangles++;
  }

  //Getters
  public double getLength()
  {
    return (this.length);
  }

  public double getWidth()
  {
    return (this.width);
  }

  //Setters
  public void setLength(double length)
  {
    this.length = length;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  public double area()
  {
    return (this.length * this.width);
  }

  public double perimeter()
  {
    return ((this.length + this.width) * 2);
  }

  public static int getNumRectangles()
  {
    return (numRectangles);
  }
}
