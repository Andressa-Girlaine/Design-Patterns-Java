public class ServicoRemessa {
    public static void shipProduct(Produto produto) {
        
        System.out.println("Enviando o produto '" + produto.name + "' para o endereço do cliente.");

        if (produto.productId == 1 || produto.productId == 2) {
            System.out.println("Este produto requer envio prioritário.");
            
        } else {
            System.out.println("Envio padrão selecionado para este produto.");
           
        }
    }
}