package navegador;

public class AbaBuscador extends AbaNavegador {
   public AbaBuscador(String titulo) {
      super(titulo);
   }
   public void buscar(String expressao) {
      this.historico[this.posHistorico++] = new String("Busca: " + expressao);
   }
   @Override
   public String getTipo() {
      return "Buscador";
   }
}
