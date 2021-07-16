public class SumOfElements
{
  public static void main(String[] args)
  {
    java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();

    fillArray(list);
    System.out.println(sumArrayElements(list));
  }

  public static void fillArray(java.util.ArrayList<Integer> list)
  {
    java.util.Random rand = new java.util.Random();
    int size = rand.nextInt(100);

    for (int i = 0; i < size; i++)
      list.add(rand.nextInt(1000));
  }

  public static int sumArrayElements(java.util.ArrayList<Integer> list)
  {
    int total = 0;

    for (int i = 0; i < list.size(); i++)
      total += list.get(i);
  
    return (total);
  }
}
