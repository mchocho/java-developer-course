public class BankAccount
{
  private String owner;
  private int    balance;


  public BankAccount(String owner)
  {
    this(owner, 0);
  }

  public BankAccount(String owner, int balance)
  {
    this.owner = owner;
    this.balance = balance;
  }

  public void deposit(int amount)
  {
    if (amount < 0)
    {
      System.out.println("Value to deposit must be greater than 0.");
      return;
    }

    this.balance += amount;
  }

  public void withdraw(int amount)
  {
    if (this.balance < amount)
    {
      System.out.println("Your balance is lower than the requested amount.");
      return;
    }
    else if (amount < 0)
    {
      System.out.println("Value to withdraw must be greater than 0.");
      return;
    }

    this.balance -= amount;
  }

  public String getOwner()
  {
    return (this.owner);
  }

  public int getBalance()
  {
    return (this.balance);
  }
}
