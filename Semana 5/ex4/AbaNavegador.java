package navegador;

public abstract class AbaNavegador{
   protected String titulo;
   protected static String historico[] = new String[100];
   protected static int posHistorico;

   public AbaNavegador(String titulo) {
      setTitulo(titulo);
   }
   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }
   public String getTitulo() {
      return this.titulo;
   }
   public static String[] getHistorico() {
      String historicoTotal[] = new String[posHistorico];
      for(int i = 0; i < posHistorico; i++) {
         historicoTotal[i] = historico[i];
      }
      return historicoTotal;
   }
   public abstract String getTipo();
}
