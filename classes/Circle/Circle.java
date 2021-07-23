public class Circle
{
  private double radius;

  public Circle()
  {
    this(1.0);
  }

  public Circle(double radius)
  {
    this.radius = radius;
  }

  public double getRadius()
  {
    return (this.radius);
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double circumference()
  {
    return (2 * Math.PI * this.radius);
  }

  public double area()
  {
    return (Math.PI * Math.pow(this.radius, 2));
  }
}
