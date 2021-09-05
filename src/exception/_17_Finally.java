package exception;

/*
17) Using finally
อธิบายการใช้ finally คู่กับ try-catch
*/

import exception.classes.BankAccount;
import exception.classes.NotEnoughMoneyException;

public class _17_Finally {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(5);
            System.out.println("Withdraw successful");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally { // ทำหลังสุด ทำงานเสมอไม่ว่าจะมีหรือไม่มี exception
            System.out.println("Hello");
        }

        try {
            account.withdraw(50000);
            System.out.println("Withdraw successful");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            // ทำ finally แล้วค่อยออก
            return; // ออกโปรแกรมแบบปกติ
            // throw e; // โยน exception
        } finally {
            System.out.println("Hello");
        }

        try {
            account.withdraw(50000);
            System.out.println("Withdraw successful");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1); // ออกโปรแกรมแบบไม่ปกติ ไม่เข้า finally
        } finally {
            System.out.println("Hello");
        }

    }
}
