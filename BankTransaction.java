abstract class BankAccount {
    abstract void transaction(String type, double amount);
}

class SavingsAccount extends BankAccount {
    double balance = 0;

    @Override
    void transaction(String type, double amount) {
        if (type.equalsIgnoreCase("deposit")) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else if (type.equalsIgnoreCase("withdraw")) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }
}

class CurrentAccount extends BankAccount {
    double balance = 0;

    @Override
    void transaction(String type, double amount) {
        if (type.equalsIgnoreCase("deposit")) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else if (type.equalsIgnoreCase("withdraw")) {
            balance -= amount;
            System.out.println("Overdraft Withdraw: " + amount + ", New Balance: " + balance);
        }
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount();

        savings.transaction("deposit", 1000);
        savings.transaction("withdraw", 500);

        current.transaction("deposit", 2000);
        current.transaction("withdraw", 2500);
    }
}
