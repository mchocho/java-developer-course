public class MethodCalls
{
  public static void main(String[] args)
  {
    doSomething();
  }

  public static void doSomething()
  {
    System.out.println("In doSomething!");

    int result = getSomeValue();

    System.out.println("result: " + result);
  }

  public static int getSomeValue()
  {
    java.util.Random rand = new java.util.Random();

    return (rand.nextInt(150) + 1);
  } 
}
