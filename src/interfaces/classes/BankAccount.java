package interfaces.classes;

/*
BankAccount Class
 */

import exception.classes.NotEnoughMoneyException;

import java.io.Serializable;

// implement ได้หลายตัว แต่ต้องใช้ method ใน interface ให้ครบ
public class BankAccount implements Measurable, Serializable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws NotEnoughMoneyException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (balance < amount) {
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

    @Override
    public double getMeasure() {
        return balance;
    }
}
