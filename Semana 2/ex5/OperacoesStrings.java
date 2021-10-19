public class OperacoesStrings {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTexto() {
        return this.texto;
    }
    public boolean checarLetra(char c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return true;
        else
            return false;
    }
    public int contaPalavras() {
        int cont = 0;
        for(int i = 0; i < texto.length();) {
            if(checarLetra(this.texto.charAt(i)))
                cont++;
            while(i < texto.length() && checarLetra(this.texto.charAt(i)))
                i++;
            while(i < texto.length() && !checarLetra(this.texto.charAt(i)))
                i++;
        }
        return cont;
    }
    public double comprimentoMedioPalavras() {
        int qtdDeLetras = 0;
        int qtdDePalavras = contaPalavras();
        double comprimentoMedio;
        for(int i = 0; i < texto.length();) {
            while(i < texto.length() && checarLetra(this.texto.charAt(i))) {
                qtdDeLetras++;
                i++;
            }
            while(i < texto.length() && !checarLetra(this.texto.charAt(i)))
                i++;
        }
        comprimentoMedio = qtdDeLetras / (double) qtdDePalavras;
        return comprimentoMedio;
    }
    public String maiorPalavra() {
        char vetor[] = new char[comprimentoMaiorPalavra()];
        int inicio = 0, fim = 0, tamDaPalavra;
        for(int i = 0; i < texto.length();) {
            tamDaPalavra = 0;
            inicio = i;
            while(i < texto.length() && checarLetra(this.texto.charAt(i))) {
                tamDaPalavra++;
                i++;
            }
            if(tamDaPalavra == comprimentoMaiorPalavra()) {
                fim = i;
                break;
            }
            while(i < texto.length() && !checarLetra(this.texto.charAt(i))) 
                i++;
        }
        for(int k = 0; inicio < fim; inicio++, k++) {
            vetor[k] = this.texto.charAt(inicio);
        }
        String maior = new String(vetor);
        return maior;
    }
    public int comprimentoMaiorPalavra() {
        int tamDaPalavra, tamMaior = 0;
        for(int i = 0; i < texto.length();) {
            tamDaPalavra = 0;
            while(i < texto.length() && checarLetra(this.texto.charAt(i))) {
                tamDaPalavra++;
                i++;
            }
            if(tamDaPalavra > tamMaior)
                tamMaior = tamDaPalavra;
            while(i < texto.length() && !checarLetra(this.texto.charAt(i)))
                i++;
        }
        return tamMaior;
    }
}
