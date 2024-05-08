public class SimulacaoJogo {
    public static void main(String[] args) {
        LocalJogo amazonia = new Amazonia();
        LocalJogo sertao = new Sertao();

        Inimigo inimigo1 = amazonia.criarInimigo();
        inimigo1.atacar();

        Inimigo inimigo2 = sertao.criarInimigo();
        inimigo2.atacar();
    }
}
