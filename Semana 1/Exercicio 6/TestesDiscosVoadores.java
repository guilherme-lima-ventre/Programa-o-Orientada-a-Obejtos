import java.util.Scanner;

public class TestesDiscosVoadores {
    public static void ordenarColunas(int m[][]) {
        int colunaMenor = 0,inicio = 0, linha, k, j;
        if(m.length == 1)
            for(j = 0; j < m[0].length - 1; j++) {
                k = j + 1;
                while(k < m[0].length) {
                    if(m[0][k] < m[0][j]) {
                        int aux = m[0][j];
                        m[0][j] = m[0][k];
                        m[0][k] = aux;
                    }
                    k++;
                }
            }
        else 
            while(inicio < m[0].length) {
                for(colunaMenor = inicio, k = inicio + 1, linha = 0; k < m[0].length; k++, linha = 0) {
                    while(m[linha][colunaMenor] == m[linha][k])
                        if(linha < m.length)
                            linha++;
                    if(m[linha][colunaMenor] > m[linha][k])
                        colunaMenor = k;
                }
                for(j = 0; j < m.length; j++) {
                    int troca = m[j][inicio];
                    m[j][inicio] = m[j][colunaMenor];
                    m[j][colunaMenor] = troca;
                }
                inicio++;
            }
    }
    public static void ordenarLinhas(int m[][]) {
        int linhaMenor = 0, inicio = 0, coluna, k, j;
        if(m[0].length == 1)
            for(j = 0; j < m.length - 1; j++) {
                k = j + 1;
                while(k < m.length) {
                    if(m[k][0] < m[j][0]) {
                        int aux = m[j][0];
                        m[j][0] = m[k][0];
                        m[k][0] = aux;
                    }
                    k++;
                }
            }
        else
            while(inicio < m.length) {
                for(linhaMenor = inicio, k = inicio + 1, coluna = 0; k < m.length; k++, coluna = 0) {
                    while(m[linhaMenor][coluna] == m[k][coluna])
                        if(coluna < m[0].length - 1)
                            coluna++;
                    if(m[linhaMenor][coluna] > m[k][coluna])
                        linhaMenor = k;
                }
                for(j = 0; j < m[0].length; j++) {
                    int troca = m[inicio][j];
                    m[inicio][j] = m[linhaMenor][j];
                    m[linhaMenor][j] = troca;
                }
                inicio++;
            }
    }
    public static void imprimir(int m[][]) {
        for(int i = 0; i < m.length; i++) {
            for(int k = 0; k < m[0].length; k++) {
                if(k == m[0].length - 1)
                    System.out.println(m[i][k]);
                else
                    System.out.print(m[i][k] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n_linhas = teclado.nextInt(), n_colunas = teclado.nextInt();
        int m[][] = new int[n_linhas][n_colunas];
        for(int i = 0; i < n_linhas; i++)
            for(int k = 0; k < n_colunas; k++)
                m[i][k] = teclado.nextInt();
        ordenarLinhas(m);
        imprimir(m);
        System.out.println();
        ordenarColunas(m);
        imprimir(m);
    }
}
