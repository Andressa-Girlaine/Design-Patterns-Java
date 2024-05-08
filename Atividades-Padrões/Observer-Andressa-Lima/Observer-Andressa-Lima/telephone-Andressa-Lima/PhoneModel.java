import java.util.ArrayList;
import java.util.List;

class PhoneModel {
    private List<Integer> digits = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void attachObserver(Screen screen) {
    }
}