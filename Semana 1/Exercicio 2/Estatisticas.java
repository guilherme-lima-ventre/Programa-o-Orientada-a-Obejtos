import java.util.Scanner;

public class Estatisticas {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0, media = 0, max = 0, min = 0, qtd = 0;
        boolean entrou = true;
        double numero = teclado.nextDouble();

        while(numero >= 0) {
            if(entrou) {
                media = numero;
                max = numero;
                min = numero;
                entrou = false;
            }
            qtd++;
            soma += numero;
            if(numero > max)
                max = numero;
            if(numero < min)
                min = numero;
            media = (double) soma / qtd;
            
            numero = teclado.nextDouble();
        }
        System.out.println(String.format("%.0f", soma));
        System.out.println(String.format("%.2f", media));
        System.out.println(String.format("%.0f", min));
        System.out.println(String.format("%.0f", max));       

        teclado.close();
    }
}
