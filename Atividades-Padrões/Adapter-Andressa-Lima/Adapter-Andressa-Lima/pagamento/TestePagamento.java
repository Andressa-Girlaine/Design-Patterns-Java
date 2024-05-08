public class TestePagamento {
    public static void main(String[] args) {
        MPay mPay = new MpayImpl();

        // Configurando o objeto MPay
        mPay.setCreditCardNo("3698521404");
        mPay.setCustomerName("Andressa Lima");
        mPay.setCardExpMonth("36");
        mPay.setCardExpYear("8965");
        mPay.setCardCVVNo((short) 231);
        mPay.setAmount(100.0);

        // Criando o Adapter para o PayPal
        PPay payPalAdapter = new PayPalAdapter(mPay);

        // Testando o método com o objeto PPay
        testarPPay(payPalAdapter);
    }

    public static void testarPPay(PPay pp) {
        System.out.println(pp.getCardOwnerName());
        System.out.println(pp.getCustCardNo());
        System.out.println(pp.getCardExpMonthDate());
        System.out.println(pp.getCVVNo());
        System.out.println(pp.getTotalAmount());
    }
}
