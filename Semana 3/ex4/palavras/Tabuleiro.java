package palavras;

public class Tabuleiro {
    private char tabuleiro[][];

    public Tabuleiro(char[][] matriz) {
        this.tabuleiro = matriz;
    }
    public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz) {
        this.tabuleiro = new char[qtdLinhas][qtdColunas];
        for(int i = 0, j = 0; i < qtdLinhas; i++)
            for(int k = 0; k < qtdColunas; k++)
                this.tabuleiro[i][k] = dadosMatriz[j++];
    }
    public PalavraEncontrada buscar(String palavra) {
        int retorno[] = new int[2];
        if(procurarLinha1(palavra) != null) {
            retorno = procurarLinha1(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 1, 1);
            return p;
        }
        else if(procurarLinha2(palavra) != null) {
            retorno = procurarLinha2(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 1, 2);
            return p;
        }
        else if(procurarColuna1(palavra) != null) {
            retorno = procurarColuna1(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 2, 1);
            return p;
        }
        else if(procurarColuna2(palavra) != null) {
            retorno = procurarColuna2(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 2, 2);
            return p;
        }
        else if(procurarDiagonal1(palavra) != null) {
            retorno = procurarDiagonal1(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 3, 1);
            return p;
        }
        else if(procurarDiagonal2(palavra) != null) {
            retorno = procurarDiagonal2(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 3, 2);
            return p;
        }
        else if(procurarDiagonal3(palavra) != null) {
            retorno = procurarDiagonal3(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 3, 3);
            return p;
        }
        else if(procurarDiagonal4(palavra) != null) {
            retorno = procurarDiagonal4(palavra);
            PalavraEncontrada p = new PalavraEncontrada(palavra, retorno, 3, 4);
            return p;
        }
        else
            return null;
    }
    public PalavraEncontrada[] buscar(String[] palavras) {
        int cont = 0;
        int retorno[] = new int[2];
        PalavraEncontrada palavrasTemp[] = new PalavraEncontrada[palavras.length];
        for(int i = 0; i < palavras.length; i++) {
            palavrasTemp[cont] = buscar(palavras[i]);
            if(palavrasTemp[cont] != null)
                cont++;
        }
        if(palavrasTemp[0] != null) {
            PalavraEncontrada palavrasFinal[] = new PalavraEncontrada[cont];
            for(int i = 0; i < cont; i++)
                palavrasFinal[i] = palavrasTemp[i];
            return palavrasFinal;
        }
        else
            return null;
    }
    public int[] procurarLinha1(String palavra) {
        if(palavra.length() > this.tabuleiro[0].length)
            return null;
        int coluna = 0, posPalavra = 0;
        for(int i = 0; i < this.tabuleiro.length; i++) {
            for(int k = 0; this.tabuleiro[i].length - k >= palavra.length(); k++) {
                coluna = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[i][coluna++]) {
                    if(palavra.length() == posPalavra) {
                        int retorno[] = new int[2];
                        retorno[0] = i;
                        retorno[1] = k;
                        return retorno;
                    }
                }
                posPalavra = 0;
            }
        }
        return null;
    }
    public int[] procurarLinha2(String palavra) {
        if(palavra.length() > this.tabuleiro[0].length)
            return null;
        int coluna = 0, posPalavra = 0;
        for(int i = 0; i < this.tabuleiro.length; i++) {
            for(int k = palavra.length() - 1; k < this.tabuleiro[i].length; k++) {
                coluna = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[i][coluna--]) {
                    if(palavra.length() == posPalavra) {
                        int retorno[] = new int[2];
                        retorno[0] = i;
                        retorno[1] = k;
                        return retorno;
                    }
                }
                posPalavra = 0;
            }
        }
        return null;
    }
    public int[] procurarColuna1(String palavra) {
        if(palavra.length() > this.tabuleiro.length)
            return null;
        int linha = 0, posPalavra = 0;
        for(int i = 0; i < this.tabuleiro[0].length; i++) {
            for(int k = 0; this.tabuleiro.length - k >= palavra.length(); k++) {
                linha = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[linha++][i]) {
                    if(palavra.length() == posPalavra) {
                        int retorno[] = new int[2];
                        retorno[0] = k;
                        retorno[1] = i;
                        return retorno;
                    }
                }
                posPalavra = 0;
            }
        }
        return null;
    }
    public int[] procurarColuna2(String palavra) {
        if(palavra.length() > this.tabuleiro[0].length)
            return null;
        int linha = 0, posPalavra = 0;
        for(int i = 0; i < this.tabuleiro[0].length; i++) {
            for(int k = palavra.length() - 1; k < this.tabuleiro.length; k++) {
                linha = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[linha--][i]) {
                    if(palavra.length() == posPalavra + 1) {
                        int retorno[] = new int[2];
                        retorno[0] = k;
                        retorno[1] = i;
                        return retorno;
                    }
                }
                posPalavra = 0;
            }
        }
        return null;
    }
    public int[] procurarDiagonal1(String palavra) {
        if(palavra.length() > this.tabuleiro.length || palavra.length() > this.tabuleiro[0].length)
            return null;
        int linha = 0, coluna = 0, posPalavra = 0;
        for(int i = palavra.length() - 1; i < this.tabuleiro.length; i++) {
            linha = i;
            for(int k = 0; this.tabuleiro[i].length - k >= palavra.length(); k++) {
                coluna = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[linha--][coluna++]) {
                    if(palavra.length() == posPalavra) {
                        int retorno[] = new int[2];
                        retorno[0] = i;
                        retorno[1] = k;
                        return retorno;
                    }
                }
                linha = i;
                posPalavra = 0;
            }
        }
        return null;
    }
    public int[] procurarDiagonal2(String palavra) {
        if(palavra.length() > this.tabuleiro.length || palavra.length() > this.tabuleiro[0].length)
            return null;
        int linha = 0, coluna = 0, posPalavra = 0;
        for(int i = 0; this.tabuleiro.length - i >= palavra.length(); i++) {
            linha = i;
            for(int k = 0; this.tabuleiro[i].length - k >= palavra.length(); k++) {
                coluna = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[linha++][coluna++]) {
                    if(palavra.length() == posPalavra) {
                        int retorno[] = new int[2];
                        retorno[0] = i;
                        retorno[1] = k;
                        return retorno;
                    }
                }
                linha = i;
                posPalavra = 0;
            }
        }
        return null;
    }
    public int[] procurarDiagonal3(String palavra) {
        if(palavra.length() > this.tabuleiro.length || palavra.length() > this.tabuleiro[0].length)
            return null;
        int linha = 0, coluna = 0, posPalavra = 0;
        for(int i = 0; this.tabuleiro.length - i >= palavra.length(); i++) {
            linha = i;
            for(int k = palavra.length() - 1; k < this.tabuleiro[i].length; k++) {
                coluna = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[linha++][coluna--]) {
                    if(palavra.length() == posPalavra) {
                        int retorno[] = new int[2];
                        retorno[0] = i;
                        retorno[1] = k;
                        return retorno;
                    }
                }
                linha = i;
                posPalavra = 0;
            }
        }
        return null;
    }
    public int[] procurarDiagonal4(String palavra) {
        if(palavra.length() > this.tabuleiro.length || palavra.length() > this.tabuleiro[0].length)
            return null;
        int linha = 0, coluna = 0, posPalavra = 0;
        for(int i = palavra.length() - 1; i < this.tabuleiro.length; i++) {
            linha = i;
            for(int k = palavra.length() - 1; k < this.tabuleiro[i].length; k++) {
                coluna = k;
                while(palavra.charAt(posPalavra++) == this.tabuleiro[linha--][coluna--]) {
                    if(palavra.length() == posPalavra) {
                        int retorno[] = new int[2];
                        retorno[0] = i;
                        retorno[1] = k;
                        return retorno;
                    }
                }
                linha = i;
                posPalavra = 0;
            }
        }
        return null;
    }
}
