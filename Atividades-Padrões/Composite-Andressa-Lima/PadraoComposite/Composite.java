import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> partes;

    public Composite() {
        partes = new ArrayList<>();
    }

    public void adicionarParte(Component parte) {
        partes.add(parte);
    }

    public float getPeso() {
        float pesoTotal = 0.0f;
        for (Component parte : partes) {
            float pesoParte = parte.getPeso();
            String nomeParte = parte.getNome();
            pesoTotal += pesoParte;
            System.out.println("Somando agora o peso de " + nomeParte +
                    ": " + pesoParte + ". Total parcial: " + pesoTotal);
        }
        return pesoTotal;
    }

    @Override
    public String getNome() {
        return null;
    }
}

