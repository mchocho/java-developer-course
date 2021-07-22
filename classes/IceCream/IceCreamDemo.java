public class IceCreamDemo
{
  public static void main(String[] args)
  {
    IceCream choco = new IceCream("Chocolate", 18, 6);

    choco.addTopping("nuts");
    choco.addTopping("sprinkes");
    choco.addTopping("caramel");

    IceCream strawberry = new IceCream("Strawberry", 12, 8);

    strawberry.addTopping("sprinkles");
  

    displayIceCream(choco);
    System.out.println();
    displayIceCream(strawberry);
  }

  public static void displayIceCream(IceCream ic)
  {
    System.out.println(ic.getName());
    System.out.println("Cost: R" + ic.getCost());
    System.out.println("Topped with: ");
    ic.printToppings();
  }
}
