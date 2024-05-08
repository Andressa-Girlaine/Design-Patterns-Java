public abstract class EditorTexto {
    public String converterTexto(String entrada){
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(caracteresConvertidos);
        return resultado;
    }
    
    protected abstract char[] converterCaracteres(char[] caracteres);
    
    protected char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }
    
    protected String juntarCaracteres(char[] caracteres) {
        return new String(caracteres);
    }

}