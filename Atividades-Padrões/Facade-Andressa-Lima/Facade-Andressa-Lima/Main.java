public class Main {
    public static void main(String[] args) {
        // Adicionando alguns produtos ao estoque
        Produto produto1 = new Produto(1, "Celular");
        Produto produto2 = new Produto(2, "Notebook");
        Produto produto3 = new Produto(3, "Fones de ouvido");

        ServicoEstoque.adicionarProduto(produto1);
        ServicoEstoque.adicionarProduto(produto2);
        ServicoEstoque.adicionarProduto(produto3);


        if (ServicoEstoque.isAvailable(produto2)) {
            if (ServicoPagamento.makePayment()) {
                ServicoRemessa.shipProduct(produto2);
            }
        }
    }
}