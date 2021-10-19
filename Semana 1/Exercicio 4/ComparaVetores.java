import java.util.Scanner;

public class ComparaVetores {
    public static boolean comparaVetores(int vetorA[], int vetorB[]) {
        int multiplicador = vetorA[0] / vetorB[0];
        for(int i = 1; i < vetorA.length; i++) {
            if(vetorA[i] / vetorB[i] != multiplicador)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        boolean checar = false;
        int[] vetorA = new int[n], vetorB = new int[n];
        for(int i = 0; i < vetorB.length; i++) {
            vetorB[i] = teclado.nextInt();
        }
        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = teclado.nextInt();
        }
        if(vetorB[0] % vetorA[0] == 0)
            checar = comparaVetores(vetorB, vetorA);
        else if(vetorA[0] % vetorB[0] == 0)
            checar = comparaVetores(vetorA, vetorB);
        if(checar)
            System.out.println("SIM");
        else
            System.out.println("NAO");
        teclado.close();
    }
}
