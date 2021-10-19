public class Principal {
    public static void main(String[] args) {
        OperacoesStrings texto1 = new OperacoesStrings();
        texto1.setTexto("  Mais     uma  frase de     teste neste     Exercicio. Deveras interessante né!!!   ");
        System.out.println(texto1.getTexto());
        System.out.println(texto1.contaPalavras());
        System.out.println(texto1.comprimentoMedioPalavras());
        System.out.println(texto1.maiorPalavra());
        System.out.println(texto1.comprimentoMaiorPalavra());
    }
}
