public class ServicoFacade {
    public static boolean processarPedido(Produto produto) {
        boolean disponivel = ServicoEstoque.isAvailable(produto);

        if (disponivel) {
            boolean pagamento = ServicoPagamento.makePayment();
            if (pagamento) {
                ServicoRemessa.shipProduct(produto);
                return true;
            }
        }

        return false;
    }
}
