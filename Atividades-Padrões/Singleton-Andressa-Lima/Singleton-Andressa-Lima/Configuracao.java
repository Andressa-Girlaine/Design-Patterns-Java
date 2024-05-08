import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Configuracao {
    private static Configuracao instancia;
    private Map<String, String> dadosConfiguracao;

    private Configuracao() {
        dadosConfiguracao = new HashMap<>();
        lerArquivoConfiguracao();
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    private void lerArquivoConfiguracao() {
        try {
            Files.lines(Paths.get("arquivo_configuracao.txt"))
                    .map(linha -> linha.split("="))
                    .filter(partes -> partes.length == 2)
                    .forEach(partes -> dadosConfiguracao.put(partes[0].trim(), partes[1].trim()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void imprimirDadosConfiguracao() {
        dadosConfiguracao.forEach((chave, valor) -> System.out.println(chave + ": " + valor));
    }

    public static void main(String[] args) {
        Configuracao configuracao = Configuracao.getInstance();
        configuracao.imprimirDadosConfiguracao();
    }
}

