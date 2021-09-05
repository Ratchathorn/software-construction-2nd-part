package interfaces;

import interfaces.classes.Organ;
import interfaces.classes.Pianist;
import interfaces.classes.Piano;

/*
18) Interfaces
อธิบายวิธีการใช้ interface
 */

public class _18_Interface {
    public static void main(String[] args) {
        Pianist pianist = new Pianist(new Piano()); // ส่ง piano ให้เล่น
        pianist.playMusic();

        pianist.setKeyboard(new Organ()); // ส่ง organ ให้เล่น
        pianist.playMusic();
    }
}
