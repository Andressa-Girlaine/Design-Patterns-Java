public class Main {
    public static void main(String[] args) {
        String texto = "Olá Mundo diz Andressa Lima";

        System.out.println("Exemplo usado no teste: "+ texto);
        
        EditorTexto editorMaiusculo = new TudoMaiuscula();
        String resultadoMaiusculo = editorMaiusculo.converterTexto(texto);
        System.out.println("Texto em maiúsculo: " + resultadoMaiusculo);
        
        EditorTexto editorMinusculo = new TudoMinuscula();
        String resultadoMinusculo = editorMinusculo.converterTexto(texto);
        System.out.println("Texto em minúsculo: " + resultadoMinusculo);
    }
}
