public class IceCream
{
  private String name;
  private int    cost;
  private int    numScoops;
  private java.util.ArrayList<String> toppings;

  public IceCream(String name, int cost, int numScoops)
  {
    this.name = name;
    this.cost = cost;
    this.numScoops = numScoops;
    this.toppings = new java.util.ArrayList<String>();
  }

  public void addTopping(String topping)
  {
    toppings.add(topping);
  }

  public String getName()
  {
    return (this.name);
  }

  public int getCost()
  {
    return (this.cost);
  }

  public int getNumScoops()
  {
    return (this.numScoops);
  }

  public void printToppings()
  {
    for (int i = 0; i < toppings.size(); i++)
      System.out.println("\t" + toppings.get(i));
  }
}
