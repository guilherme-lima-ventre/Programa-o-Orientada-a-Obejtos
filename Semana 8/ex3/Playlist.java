package multimidia;

public class Playlist extends Exception {
   private int indiceAtual;
   private ArquivoMultimidia lista[];

   public Playlist() {
      this.indiceAtual = 0;
      this.lista = new ArquivoMultimidia[10];
   }
   public void adicionarItem(ArquivoMultimidia arquivo) throws Exception {
      if(indiceAtual > 9)
         throw new QuantidadeLimiteArquivos();
      else
         this.lista[indiceAtual++] = arquivo;
   }
   public void renomearItem(int indiceArquivo, String novoNomeArquivo) throws Exception {
      if(indiceArquivo < 0 || indiceArquivo > this.indiceAtual - 1)
         throw new IndiceArquivoInvalido(indiceArquivo);
      else
         this.lista[indiceArquivo].setNomeArquivo(novoNomeArquivo);
   }
   public void moverParaInicio(int indiceArquivo) throws Exception {
      if(indiceArquivo < 0 || indiceArquivo > this.indiceAtual - 1)
         throw new IndiceArquivoInvalido(indiceArquivo);
      else {
         for(int i = indiceArquivo; i > 0; i--) {
            ArquivoMultimidia tmp = this.lista[i];
            this.lista[i] = this.lista[i - 1];
            this.lista[i - 1] = tmp;
         }
      }
   }
   public String[] listarArquivos() {
      String retorno[] = new String[this.indiceAtual];
      for(int i = 0; i < this.indiceAtual; i++)
         retorno[i] = this.lista[i].toString();
      return retorno;
   }
   public void ordenarArquivos(int tipo) {
      if(tipo == 1) {
         //alfabetica se for igual tam menor -> maior
         for(int inicio = 0, i = this.indiceAtual - 1, k = i - 1; k >= inicio; i--, k = i - 1) {
            if(this.lista[i].getNomeArquivo().compareTo(this.lista[k].getNomeArquivo()) < 0) {
               ArquivoMultimidia tmp = this.lista[i];
               lista[i] = this.lista[k];
               this.lista[k] = tmp;
            }
            else if(this.lista[i].getNomeArquivo().compareTo(this.lista[k].getNomeArquivo()) == 0) {
               if(this.lista[i].getTamanhoArquivo() < this.lista[k].getTamanhoArquivo()) {
                  ArquivoMultimidia tmp = this.lista[i];
                  lista[i] = this.lista[k];
                  this.lista[k] = tmp;
               }
            }
            if(k == inicio) {
               if(inicio == indiceAtual)
                  break;
               inicio++;
               i = this.indiceAtual;
            }
         }
      }
      else if(tipo == 2) {
         //tam menor -> maior se for igual alfabetica
         for(int inicio = 0, i = this.indiceAtual - 1, k = i - 1; k >= inicio; i--, k = i - 1) {
            if(this.lista[i].getTamanhoArquivo() < this.lista[k].getTamanhoArquivo()) {
               ArquivoMultimidia tmp = this.lista[i];
               lista[i] = this.lista[k];
               this.lista[k] = tmp;
            }
            else if(this.lista[i].getTamanhoArquivo() == this.lista[k].getTamanhoArquivo()) {
               if(this.lista[i].getNomeArquivo().compareTo(this.lista[k].getNomeArquivo()) < 0) {
                  ArquivoMultimidia tmp = this.lista[i];
                  lista[i] = this.lista[k];
                  this.lista[k] = tmp;
               }
            }
            if(k == inicio) {
               if(inicio == indiceAtual)
                  break;
               inicio++;
               i = this.indiceAtual;
            }
         }
      }
   }
}

class QuantidadeLimiteArquivos extends Exception {
   public QuantidadeLimiteArquivos() {
      super("Quantidade limite de arquivos foi atingida.");
   }
}

class IndiceArquivoInvalido extends Exception {
   public IndiceArquivoInvalido(int indiceArquivo) {
      super("Indice de arquivo invalido = " + indiceArquivo);
   }
}
