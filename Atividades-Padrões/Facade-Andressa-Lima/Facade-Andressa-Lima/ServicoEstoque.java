import java.util.ArrayList;
import java.util.List;

public class ServicoEstoque {
    private static List<Produto> estoque = new ArrayList<>();

    public static void adicionarProduto(Produto produto) {
        estoque.add( produto);
    }

    public static boolean isAvailable(Produto produto) {
       
        if (estoque.contains(produto)) {
            System.out.println("Produto " + produto.name + " está disponível no estoque.");
            return true;
        } else {
            System.out.println("Produto " + produto.name + " não está disponível no estoque.");
            return false;
        }
    }
}