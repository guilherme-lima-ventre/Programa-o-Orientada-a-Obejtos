package navegador;

public class AbaRedeSocial extends AbaNavegador {
   public AbaRedeSocial(String titulo) {
      super(titulo);
   }
   public void postar(String texto) {
      this.historico[this.posHistorico++] = new String("Post: " + texto);
   }
   @Override
   public String getTipo() {
      return "RedeSocial";
   }
}
