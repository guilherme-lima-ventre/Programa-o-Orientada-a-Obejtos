import java.util.Scanner;

public class CampoMinado {
    public static void preencherMatriz(int m[][]) {
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < m.length; i++)
            for(int k = 0; k < m[0].length; k++)
                m[i][k] = teclado.nextInt();
    }
    public static int contarBombas(int m[][], int linha, int coluna) {
        int cont = 0;

        for(int i = linha - 1; i < linha + 2; i++) {
            if(i >= 0 && i < m.length) {
                for(int k = coluna - 1; k < coluna + 2; k++) {
                    if(k >= 0 && k < m[0].length) {
                        if(i != linha || k != coluna)
                            if(m[i][k] == 1)
                                cont++;
                    }
                }
            }
        }

        return cont;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int linhas, colunas, checarLinha, checarColuna, qtdBombas;
        linhas = teclado.nextInt();
        colunas = teclado.nextInt();
        int m[][] = new int[linhas][colunas];
        preencherMatriz(m);
        checarLinha = teclado.nextInt();
        checarColuna = teclado.nextInt();
        qtdBombas = contarBombas(m, checarLinha, checarColuna);
        System.out.println(qtdBombas);
    }
}
