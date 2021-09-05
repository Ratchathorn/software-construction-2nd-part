package interfaces.classes;

public class Organ implements Keyboard {

    public void pressWhiteKey(int i) {
        System.out.println("Blow wind through pipe " + i);
    }

    public void pressBlackKey(int i) {
        System.out.println("Blow wind through pipe " + i + ".5");
    }
}
