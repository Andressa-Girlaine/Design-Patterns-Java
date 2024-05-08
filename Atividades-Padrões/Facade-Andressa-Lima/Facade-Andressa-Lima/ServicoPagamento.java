public class ServicoPagamento {
    public static boolean makePayment() {

        boolean pagamentoEfetuado = Math.random() < 0.5;

        if (pagamentoEfetuado) {
            System.out.println("Pagamento efetuado com sucesso.");
        } else {
            System.out.println("Falha ao processar o pagamento.");
        }

        return pagamentoEfetuado;
    }
}
