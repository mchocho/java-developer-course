/*
 * StringBuilder Class
 *    Because strings are immutuable we need a way to
 *    mutate them without creating a new string. In steps the
 *    StringBuilder Class
 *      - The object can be modified
 *      - Have many of the same methods as the String class
 *      - Also have methods the String class doesn't have
 */

public class StringBuilderFun
{
  public static void main(String[] args)
  {
    StringBuilder sb = new StringBuilder("The Hulk");  
    int indexOfSpace;

    sb.append(" must smash!");
    System.out.println(sb);


    sb.insert(3, " Incredible"); //Places data inside a string from a specified index
    System.out.println(sb);

    sb.replace(20, 24, "will");
    System.out.println(sb);

    sb.delete(3, 14);
    System.out.println(sb);

    indexOfSpace = sb.indexOf(" ");
    sb.replace(0, indexOfSpace, "Dr.");
    System.out.println(sb);

    
  }
}
