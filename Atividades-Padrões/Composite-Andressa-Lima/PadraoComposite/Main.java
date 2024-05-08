
public class Main {
    public static void main(String[] args) {
        // Criando as partes do carro
        Component paraLamas = new Part("Para-lamas", 10.0f);
        Component portas = new Part("Portas", 20.0f);
        Component paineis = new Part("Painéis", 15.0f);
        Component portaMalas = new Part("Porta-malas", 30.0f);
        Component capo = new Part("Capô", 25.0f);

        Component motor = new Part("Motor", 150.0f);
        Component transmissao = new Part("Transmissão", 80.0f);
        Component diferencial = new Part("Diferencial", 50.0f);
        Component rodas = new Part("Rodas", 60.0f);

        // Criando a estrutura do carro usando o Composite
        Composite carroceria = new Composite();
        carroceria.adicionarParte(paraLamas);
        carroceria.adicionarParte(portas);
        carroceria.adicionarParte(paineis);
        carroceria.adicionarParte(portaMalas);
        carroceria.adicionarParte(capo);

        Composite tremDeForca = new Composite();
        tremDeForca.adicionarParte(motor);
        tremDeForca.adicionarParte(transmissao);
        tremDeForca.adicionarParte(diferencial);
        tremDeForca.adicionarParte(rodas);

        // Calculando o peso total do carro
        float pesoTotal = carroceria.getPeso() + tremDeForca.getPeso();

        System.out.println("Peso total do carro: " + pesoTotal);
    }
}