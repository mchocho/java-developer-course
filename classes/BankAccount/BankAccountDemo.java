public class BankAccountDemo
{
  public static void main(String[] args)
  {
    java.util.Random rand = new java.util.Random();
    BankAccount myAcc = new BankAccount("Sal'e", rand.nextInt(300));
    BankAccount jeffsAcc = new BankAccount("Jeff Bezos", rand.nextInt(260000000));
    int deposit = 42;
    int withdraw = 250;

    System.out.println("The first account belongs to " + myAcc.getOwner() + " with a balance of " + myAcc.getBalance());
    myAcc.deposit(deposit);
    System.out.println("After making a deposit of " + deposit + " the balance is now " + myAcc.getBalance());
    myAcc.withdraw(withdraw);
    System.out.println("Withdrawing " + withdraw + " will leave " + myAcc.getOwner() + " with a balance of " + myAcc.getBalance());

    System.out.println();

    System.out.println("The second account belongs to " + jeffsAcc.getOwner() + " with a balance of " + jeffsAcc.getBalance());
    withdraw = rand.nextInt(5000000);

    jeffsAcc.withdraw(withdraw);
    System.out.println("Withdrawing " + withdraw + " will leave " + jeffsAcc.getOwner() + " with a balance of " + jeffsAcc.getBalance());

  }
}
