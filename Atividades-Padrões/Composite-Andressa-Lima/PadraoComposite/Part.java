public class Part implements Component {
    private String nome;
    private float peso;

    public Part(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public String getNome(){
        return nome;
    }
}