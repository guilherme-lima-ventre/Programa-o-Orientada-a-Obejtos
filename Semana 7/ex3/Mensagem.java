package chat;

public abstract class Mensagem {
   private int likes;
   private Mensagem resposta = null, responde = null;

   public Mensagem() {
      this.likes = 0;
   }
   public void like() {
      (this.likes)++;
   }
   public int getLikes() {
      return this.likes;
   }
   public Mensagem getResposta() {
      return this.resposta;
   }
   public Mensagem getResponde() {
      return this.responde;
   }
   public void setResponde(Mensagem responde) {
      this.responde = responde;
   }
   public void responder(Mensagem resposta) {
      this.resposta = resposta;
      resposta.setResponde(this);
   }
   public abstract String getSemLike();
   public abstract String getRepSecundaria();
   public abstract String getRepresentacao();
}

class MensagemTexto extends Mensagem {
   private String mensagem;

   public MensagemTexto(String mensagem) {
      this.mensagem = mensagem;
   }
   public String getSemLike() {
      return this.mensagem;
   }
   public String getRepSecundaria() {
      if(this.getResponde() == null)
         return this.getSemLike();
      else {
         Mensagem responde = this.getResponde();
         if(responde.getResponde() == null)
            return this.getSemLike() + " RESPOSTA A [" + responde.getSemLike() + "]";
         return this.getSemLike() + " RESPOSTA A [" + responde.getRepSecundaria() + "]";
      }
   }
   public String getRepresentacao() {
      if(this.getResponde() == null)
         return this.getSemLike() + " (likes=" + this.getLikes() + ")";
      else {
         Mensagem responde = this.getResponde();
         if(responde.getResponde() == null)
            return this.getSemLike() + " RESPOSTA A [" + responde.getSemLike() + "] (likes=" + this.getLikes() + ")";
         return this.getSemLike() + " RESPOSTA A [" + responde.getRepSecundaria() + "] (likes=" + this.getLikes() + ")";
      }
   }
}

class MensagemImagem extends Mensagem {
   private int largura, altura;
   String arquivoImagem;

   public MensagemImagem(String arquivoImagem, int largura, int altura) {
      this.arquivoImagem = arquivoImagem;
      this.largura = largura;
      this.altura = altura;
   }
   public String getSemLike() {
      return this.arquivoImagem + " " + this.largura + "x" + this.altura;
   }
   public String getRepSecundaria() {
      if(this.getResponde() == null)
         return this.getSemLike();
      else {
         Mensagem responde = this.getResponde();
         if(responde.getResponde() == null)
            return this.getSemLike() + " RESPOSTA A [" + responde.getSemLike() + "]";
         return this.getSemLike() + " RESPOSTA A [" + responde.getRepSecundaria() + "]";
      }
   }
   public String getRepresentacao() {
      if(this.getResponde() == null)
         return this.getSemLike() + " (likes=" + this.getLikes() + ")";
      else {
         Mensagem responde = this.getResponde();
         if(responde.getResponde() == null)
            return this.getSemLike() + " RESPOSTA A [" + responde.getSemLike() + "] (likes=" + this.getLikes() + ")";
         return this.getSemLike() + " RESPOSTA A [" + responde.getRepSecundaria() + "] (likes=" + this.getLikes() + ")";
      }
   }
}
