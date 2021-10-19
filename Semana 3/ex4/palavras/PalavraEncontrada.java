package palavras;

public class PalavraEncontrada {
    private String palavra;
    private int[] posicao;
    private int tipo, direcao;
    
    public PalavraEncontrada(String palavra, int[] posicao, int tipo, int direcao) {
        this.palavra = palavra;
        this.posicao = posicao;
        this.tipo = tipo;
        this.direcao = direcao;
    }
    public String getPalavra() {
        return this.palavra;
    }
    public int[] getPosicao() {
        return this.posicao;
    }
    public int getTipo() {
        return this.tipo;
    }
    public int getDirecao() {
        return this.direcao;
    }
}
