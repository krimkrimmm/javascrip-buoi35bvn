package vn.scrip.buoi35_bvn;
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("✅ Nạp tiền thành công: " + amount + " VND");
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("❌ Số dư không đủ để rút: " + amount + " VND");
        }
        balance -= amount;
        System.out.println("✅ Rút tiền thành công: " + amount + " VND");
    }
    public double getBalance() {
        return balance;
    }
}







