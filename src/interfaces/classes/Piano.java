package interfaces.classes;

public class Piano implements Keyboard {

    @Override
    public void pressWhiteKey(int i) {
        System.out.println("Soft hammer hits wire " + i);
    }

    @Override
    public void pressBlackKey(int i) {
        System.out.println("Soft hammer hits wire " + i + ".5");
    }
}
