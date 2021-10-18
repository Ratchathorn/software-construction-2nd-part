package exception.classes;

/*
BankAccount Class
 */

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    } // help

    public void deposit(double amount) {
        balance += amount;
    }

    // ถ้าอยากใช้ Exception ต้อง throws Exception
    public void withdraw(double amount) throws NotEnoughMoneyException {
        if (amount <= 0) {
            // unchecked exception ไม่ต้องไปประกาศ
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (balance < amount) {
            // throw = โยน object ของ Exception
            // new = สร้าง object ของ Exception
            // โยน exception พร้อมกับคำอธิบาย
//             throw new IllegalArgumentException("Cannon withdraw more than balance");
//
            // ทุกบรรทัดหลัง throw จะไม่ทำงาน
            throw new NotEnoughMoneyException("Cannon withdraw more than balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
