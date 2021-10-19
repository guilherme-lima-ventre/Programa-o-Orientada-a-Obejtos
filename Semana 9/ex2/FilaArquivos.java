package arquivos;

public class FilaArquivos<T extends Arquivo> implements Fila<T> {
   private int capacidade, qtdAtual;
   private NoFila inicio, fim;
      
   public FilaArquivos(int n) {
      this.capacidade = n;
      this.qtdAtual = 0;
      this.inicio = null;
      this.fim = null;
   }
   @Override
   public boolean enfileirar(T arquivo) {
      NoFila<T> novo = new NoFila<T>(arquivo);

      if(this.qtdAtual == this.capacidade)
         return false;

      if(this.fim != null)
         this.fim.prox = novo;
      this.fim = novo;

      if(inicio == null)
         this.inicio = novo;
      
      this.qtdAtual++;
      return true;
   }
   @Override
   public T desenfileirar() {
      if(this.qtdAtual == 0)
         return null;

      NoFila<T> remover = this.inicio;
      this.inicio = this.inicio.prox;
      T arquivo = remover.arquivo;
      remover = null;

      if(this.inicio == null)
         this.fim = null;
         
      this.qtdAtual--;
      return arquivo;
   }
   public static class NoFila<T> {
      T arquivo;
      NoFila<T> prox;

      public NoFila (T arquivo) {
         this.arquivo = arquivo;
         this.prox = null;
      }
   }
}
