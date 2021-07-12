/*
 * Random Numbers
 *   Pseudo-random number generators (PRNGSs)
 *     - Produce sufficiently random values
 *     - https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
 */

public class RandomFun
{
  public static void main(String[] args)
  {
    java.util.Random random = new java.util.Random();
    int myRandomNumber;

    myRandomNumber = random.nextInt(); //Returns an integer within range of 2^32 signed and unsigned
    System.out.println("Number is:\t" + myRandomNumber);

    myRandomNumber = random.nextInt(1000); //Returns 0 - 999
    System.out.println("0 through 999:\t" + myRandomNumber);

    myRandomNumber = random.nextInt(1000) + 1; //Shift range 1 - 1000
    System.out.println("1 through 1000:\t" + myRandomNumber);

  }
}
