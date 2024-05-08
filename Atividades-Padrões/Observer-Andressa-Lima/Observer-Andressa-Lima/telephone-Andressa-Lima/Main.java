
public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        keyPad.simulateKeyPresses(NUM_DIGITS);
        
        screen.update(NUM_DIGITS);
    }
}