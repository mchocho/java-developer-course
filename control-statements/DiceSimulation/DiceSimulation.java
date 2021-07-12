public class DiceSimulation
{
  public static void main(String[] args)
  {
    java.util.Random random = new java.util.Random();
    int count = 0;
    int result;

    while(count < 10)
    {
      System.out.println("Shake em up...");
      result = random.nextInt(6) + 1;
      System.out.println("You rolled a " + result + "\n");
      count++;
    }
  }
}
