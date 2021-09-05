package exception.classes;

/*
NotEnoughMoneyException Class

ถ้าอยากสร้าง unchecked exception ให้สร้างคลาสแล้ว extends RuntimeException
ถ้าอยากสร้าง checked exception ให้สร้างคลาสแล้ว extends Exception
หรือ subclass ของ Exception/RuntimeException

ต้องสร้าง constructor 2 ตัว
 */

public class NotEnoughMoneyException extends Exception { // checked exception (ถ้าเอาไปใช้ต้องใช้ throws)

    // constructor 1 - default constructor
    public NotEnoughMoneyException() {}

    // constructor 2 - constructor รับคำอธิบาย
    public NotEnoughMoneyException(String errorMessage) {
        super(errorMessage);
    }
}
