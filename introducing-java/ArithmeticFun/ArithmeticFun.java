/*
 * Arithmetic Operators
 *
 * + (Addition)
 * - (Minus)
 * * (Multiplication)
 * / (Division)
 * % (Modulus)
 */

/*
 * Compound Arithmetic Operators
 *   Shorcut operators for performing arithmetic and assigning the result
 *
 * +=
 * -=
 * *=
 * /=
 * %=
 */

/*
 * Don't forget increment and decrement
 *    These are known as unary operator because they only have one operand
 *    which is the variable being updated. Everything else is known as binary operators
 *
 * ++ (Add 1)
 * -- (Minus 1)
 */

public class ArithmeticFun
{
  public static void main(String[] args)
  {
    int a = 20;
    int b = 42;

    //Binary operators
    int result   = a + b;
    int diff     = a - b;
    int product  = a * b;
    double quotient = b / a;
    int rem      = b % a;

    System.out.println("Result is " + result);
    System.out.println("Difference is " + diff);
    System.out.println("Product is " + product);
    System.out.println("Quotient is " + quotient);
    System.out.println("Remainder is " + rem);

    result += 20; //Shortcut for result = result + 20
    System.out.println("Result is now " + result);

    //Unary operators
    result++;
    System.out.println("Result++ is now " + result);

    result--;
    System.out.println("Result-- is not " + result);

    product *= 2;
    System.out.println("New product is now " + product);
  }
}
