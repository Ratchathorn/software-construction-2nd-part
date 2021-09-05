package exception;

import exception.classes.BankAccount;
import exception.classes.NotEnoughMoneyException;

/*
15) Exception handling
อธิบายการใช้ Exception ที่สร้างขึ้นเอง
 */

public class _15_ExceptionHandling {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println(account);

        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(1500);
            System.out.println(account);
        } catch (NotEnoughMoneyException e) {
            // ไม่ทำงานเพราะไม่เจอ Exception
            System.err.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(10000);
            // เจอ Exception เลยหยุดทำงาน
            // ส่งต่อไปที่ catch ไม่ทำงานต่อ
            System.out.println(account);
        } catch (NotEnoughMoneyException e) {
            // Exception มี getMessage() ไว้เรียกคำอธิบาย
            System.err.println("Error: " + e.getMessage());

            // Exception มี toString() ไว้เรียกคำอธิบายกับชื่อคลาส
            System.err.println("Error: " + e.toString());

            // Exception มี printStackTrace() ไว้หาว่าผิดตรงไหน (debug)
            e.printStackTrace();
        } // catch (IOException e) ... สามารถมี catch ได้หลายตัว
    }
}
