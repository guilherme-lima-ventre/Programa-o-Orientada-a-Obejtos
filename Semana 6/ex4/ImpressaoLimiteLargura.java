package relatorio;

public class ImpressaoLimiteLargura implements PluginImpressao {
   protected int largura;

   public ImpressaoLimiteLargura(int largura) {
      this.largura = largura;
   }
   @Override
   public void imprimir(Relatorio r) { 
      String texto = r.getTexto();
      int tamanhoTexto, tamAtualLinha, tamPalavra, comecoDaLinha, comecoDaPalavra;
      tamanhoTexto = texto.length();
      for(int posAtual = 0; posAtual < tamanhoTexto;) {
         comecoDaLinha = posAtual;
         tamAtualLinha = 0; 
         tamPalavra = 0; 
         while(posAtual + tamPalavra < tamanhoTexto && tamAtualLinha + tamPalavra - 1 <= this.largura) { 
            posAtual += tamPalavra;
            tamAtualLinha += tamPalavra;
            comecoDaPalavra = posAtual;
            tamPalavra = medirPalavra(r.getTexto(), comecoDaPalavra, tamanhoTexto);
         }
         if(posAtual + tamPalavra >= tamanhoTexto) {
            posAtual += tamPalavra;
            transferirParaVetor(r.getTexto(), comecoDaLinha, tamPalavra);
         }
         else
            transferirParaVetor(r.getTexto(), comecoDaLinha, tamAtualLinha);
      }
   }
   public void transferirParaVetor(String texto, int indiceInicial, int indiceFinal) {
      if(texto.charAt(indiceFinal + indiceInicial - 1) == ' ')
         indiceFinal--;
      char imprimir[] = new char[indiceFinal];
      for(int i = 0; i < indiceFinal; i++, indiceInicial++) {
         imprimir[i] = texto.charAt(indiceInicial);
      }
      String impressaoFinal = new String(imprimir);
      Impressao.imprimirLinha(impressaoFinal);
   }
   public int medirPalavra(String texto, int indiceInicial, int tamanhoTexto) { //neste exercicio, sao usados plugins.
      int tamPalavra = 0;
      while(indiceInicial < tamanhoTexto && texto.charAt(indiceInicial) != ' ') {
         tamPalavra++;
         indiceInicial++;
      }
      if(indiceInicial == tamanhoTexto)
         return tamPalavra;
      else
         return tamPalavra + 1;
   }
}
