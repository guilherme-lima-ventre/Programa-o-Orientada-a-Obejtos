package estruturas;

public class Conjunto implements Lista {
   protected int qtdItens = 0;
   protected NoLista inicio = null;
   
   public static class NoLista {
      int numero;
      NoLista prox;

      public NoLista(int numero) {
         this.numero = numero;
         this.prox = null;
      }
   }
   @Override
   public int getQtd() {
      return this.qtdItens;
   }
   @Override
   public void adicionar(int numero) {
      for(NoLista atual = this.inicio; atual != null; atual = atual.prox) {
         if(atual.numero == numero)
            return;
      }
      NoLista novo = new NoLista(numero);
      if(this.inicio == null)
         this.inicio = novo;
      else {
         NoLista atual = this.inicio;
         while(atual.prox != null) {
            atual = atual.prox;
         }
         atual.prox = novo;
      }
      qtdItens++;
   }
   @Override
   public void remover(int numero) {
      if(this.inicio == null) 
         return;
      NoLista atual = inicio, anterior = null;
      while(atual != null && atual.numero != numero){
         anterior = atual;
         atual = atual.prox;
      }
      if(atual == null) 
         return;
      if(anterior == null) 
         this.inicio = atual.prox;
      else
         anterior.prox = atual.prox;
      atual.prox = null;
      atual = null;
      this.qtdItens--;
   }
   @Override
   public int buscar(int numero) {
      int indice = 0;
      for(NoLista atual = this.inicio; atual != null; atual = atual.prox, indice++) {
         if(atual.numero == numero)
            return indice;
      }
      return -1;
   }
   public int buscarNumero(int indice) {
      NoLista atual = this.inicio;
      for(int i = 0; i < indice; i++)
         atual = atual.prox;
      return atual.numero;
   }
   public String toString() {
      String todosNum = "";
      for(NoLista atual = this.inicio; atual != null; atual = atual.prox) {
         if(atual.prox == null)
            todosNum += atual.numero;
         else
            todosNum += atual.numero + " ";
      }
      return todosNum;
   }
   public static Conjunto uniao(Conjunto a, Conjunto b) {
      Conjunto c = new Conjunto();
      for(int i = 0; i < a.getQtd(); i++)
         c.adicionar(a.buscarNumero(i));
      for(int i = 0; i < b.getQtd(); i++) {
         boolean add = true;
         int comparar = b.buscarNumero(i);
         for(int k = 0; k < a.getQtd(); k++) {
            if(comparar == a.buscarNumero(k))
               add = false;
         }
         if(add)
            c.adicionar(comparar);
      }
      return c;
   }
   public static Conjunto intersecao(Conjunto a, Conjunto b) {
      Conjunto c = new Conjunto();
      for(int i = 0; i < a.getQtd(); i++) {
         int comparar = a.buscarNumero(i);
         for(int k = 0; k < b.getQtd(); k++) {
            if(comparar == b.buscarNumero(k))
               c.adicionar(comparar);
         }
      }
      return c;
   }
}
