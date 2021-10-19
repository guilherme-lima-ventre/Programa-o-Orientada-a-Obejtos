package relatorio;

public class TextoData implements PluginTexto {
   protected int dia, mes, ano;

   public TextoData(int dia, int mes, int ano) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   }
   @Override
   public String aplicar(String texto) {
      return texto + " (DATA: " + this.dia + "/" + this.mes + "/" + this.ano + ")";
   }
}
