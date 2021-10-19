import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for(int i = 0, k = n; i < n; i++, k--) {
            int esq = k - 1, dir = k - 1, meio = i*2 + 1;
            while(esq > 0) {
                System.out.print("-");
                esq--;
            }
            while(meio > 0) {
                System.out.print("1");
                meio--;
            }
            while(dir > 0) {
                System.out.print("-");
                dir--;
            }
            System.out.println();
        }

        teclado.close();
    }
}
