package chat;

public class ListaMensagens {
   private NoMensagem inicio = null;
   private int qtdMensagens = 0;

   public static class NoMensagem {
      Mensagem mensagem;
      NoMensagem prox = null;

      public NoMensagem(Mensagem mensagem) {
         this.mensagem = mensagem;
      }
   }
   public void adicionarMensagem(Mensagem mensagem) {
      NoMensagem novo = new NoMensagem(mensagem);
      if(this.inicio == null) {
         this.inicio = novo;
         qtdMensagens++;
         return;
      }
      NoMensagem atual;
      for(atual = this.inicio; atual.prox != null; atual = atual.prox);
      atual.prox = novo;
      qtdMensagens++;
   }
   public void responderMensagem(int indiceMensagemOriginal, Mensagem resposta) {
      this.adicionarMensagem(resposta);
      NoMensagem atual = this.inicio;
      for(int i = 0; i < indiceMensagemOriginal; i++, atual = atual.prox);
      atual.mensagem.responder(resposta);
   }
   public Mensagem[] getMensagens() {
      Mensagem retorno[] = new Mensagem[this.qtdMensagens];
      NoMensagem atual = this.inicio;
      for(int i = 0; i < qtdMensagens; i++, atual = atual.prox)
         retorno[i] = atual.mensagem;
      return retorno;
   }
   public String[] getMensagensString() {
      String retorno[] = new String[this.qtdMensagens];
      NoMensagem atual = this.inicio;
      for(int i = 0; i < qtdMensagens; i++, atual = atual.prox)
         retorno[i] = atual.mensagem.getRepresentacao();
      return retorno;
   }
   public void like(int indiceMensagem) {
      NoMensagem atual = this.inicio;
      for(int i = 0; i < indiceMensagem; i++, atual = atual.prox);
      atual.mensagem.like();
   }
}
