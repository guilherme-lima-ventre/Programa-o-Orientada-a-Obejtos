import java.util.Scanner;

public class Potencias2 {
    public static int contarPotencias(int vetor[]) {
        int cont = 0;

        for(int i = 0; i < vetor.length; i++) {
            double numeroAtual = vetor[i];
            while(numeroAtual > 1) {
                numeroAtual = numeroAtual / 2.0;
            }
            if(numeroAtual == 1)
                cont++;
        }

        return cont;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int vetor[] = new int[n];

        for(int i = 0; i < n; i++) {
            vetor[i] = teclado.nextInt();
        }

        int qtdPotencias = contarPotencias(vetor);
        System.out.println(qtdPotencias);
        teclado.close();
    }
}
