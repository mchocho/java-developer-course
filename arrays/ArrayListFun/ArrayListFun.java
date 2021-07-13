/*
 * ArrayLists
 *   - Unlike arrays, which have a fixed size, ArrayList can resize
 *   - ArrayLists live in the java.util package
 *   https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 */

public class ArrayListFun
{
  public static void main(String[] args)
  {
    	java.util.ArrayList<String> namesList;

	namesList = new java.util.ArrayList<>();

	namesList.add("Bill");
	namesList.add("Ted");
	namesList.add("Mathew");
	namesList.add("Mandy");
	namesList.add("Charity");

	/*
	for(int i = 0; i < namesList.size(); i++)
	{
	  System.out.println(namesList.get(i));
	}
	*/

	for (String name : namesList)
	{
	  System.out.println(name);
	}
  }
}
