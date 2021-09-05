package interfaces.classes;

public class Pianist {

    // type เป็น interface (สามารถส่งคลาสที่ implements Keyboard ได้ เช่น Piano)
    // ถ้า interface เหมือนกัน ใช้ได้เหมือนกัน (Keyboard/Piano/Organ)
    private Keyboard keyboard;

    public Pianist(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void playMusic() {
        keyboard.pressWhiteKey(1);
        keyboard.pressWhiteKey(2);
        keyboard.pressWhiteKey(3);
    }
}
