import java.io.File;


public class Main {
    public static void main(String[] args) {
        File inputTextFile = new File("Hamlet.txt");
        WebSearchModel model = new WebSearchModel(inputTextFile);
        Snooper snoop = new Snooper(model);
        model.pretendToSearch();
    }
}

