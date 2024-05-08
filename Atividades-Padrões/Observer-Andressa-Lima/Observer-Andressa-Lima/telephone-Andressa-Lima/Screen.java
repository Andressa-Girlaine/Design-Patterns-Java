public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }

    public void update(int digit) {
        System.out.println("Agora discando " + getPhoneNumber() + "...");
    }

    private String getPhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder();
        for (int digit : model.getDigits()) {
            phoneNumber.append(digit);
        }
        return phoneNumber.toString();
    }
}