/*
 * Relational Operators
 *
 * >   (Greater than)
 * >=  (Greater than or equal to)
 * <   (Less than)
 * <=  (Less than or equal to)
 * ==  (Equality operators)
 * !=  (Not equal to)
 */

public class RelationalFun
{
  public static void main(String[] args)
  {
    boolean myBool     = true;
    boolean yourBool   = false;
    int     myAge      = 26;
    int     yourAge    = 20;
    int     mandysAge  = 27;
    int     currentAge = 26;

    String  myName    = "Sal'e";
    String  yourName  = "Bob";

    System.out.println("myBool is " + myBool);
    System.out.println("yourBool is " + yourBool);

    //Relational operators
    boolean ageComparison = myAge > yourAge;

    System.out.println("myAge > yourAge: " + ageComparison);

    ageComparison = yourAge > mandysAge;
    System.out.println("yourAge > mandysAge: " + ageComparison);

    ageComparison = yourAge == mandysAge;
    System.out.println("yourAge == mandysAge: " + ageComparison);

    //The only way to compare strings natively is to use the String prototype method equals()
    boolean nameComparison = myName.equals(yourName);
    System.out.println("Do names match: " + nameComparison);

    ageComparison = currentAge >= 21;
    System.out.println("Is age greater than or equal to 21: " + ageComparison);
  } //End main
}
