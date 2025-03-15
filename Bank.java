class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawal not supported in base class.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Withdrawal failed. Balance must remain above ₹" + MIN_BALANCE);
        }
    }
}
class CurrentAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000;
    private static final double PENALTY = 50;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New Balance: ₹" + balance);
            if (balance < MIN_BALANCE) {
                balance -= PENALTY;
                System.out.println("Penalty of ₹" + PENALTY + " charged. New Balance: ₹" + balance);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000);
        CurrentAccount current = new CurrentAccount("CA456", 2000);

        System.out.println("Savings Account:");
        savings.deposit(500);
        savings.withdraw(800);
        savings.withdraw(1200);

        System.out.println("\nCurrent Account:");
        current.deposit(1000);
        current.withdraw(2500);
        current.withdraw(700);
    }
}
