class BankAccount 
{
    protected double balance;

    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public double getBalance()
    {
        return balance;
    }
}

class SavingsAccount extends BankAccount
{

    public SavingsAccount(double initialBalance) 
    {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) 
    {
        if (balance - amount < 100) 
        {
            System.out.println("Withdrawal denied. Minimum balance of 100/- must be maintained.");
        } else 
        {
            super.withdraw(amount);
        }
    }
}

public class Bank 
{
    public static void main(String[] args) 
    {
        SavingsAccount savings = new SavingsAccount(500);

        savings.deposit(2000);     
        savings.withdraw(300);    
        savings.withdraw(350);    
        System.out.println("Final Balance: " + savings.getBalance());
    }
}
