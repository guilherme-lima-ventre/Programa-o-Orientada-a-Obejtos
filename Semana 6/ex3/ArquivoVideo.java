package multimidia;

public class ArquivoVideo extends ArquivoMultimidia implements Cloneable {
   private int largura, altura;

   public ArquivoVideo(String nomeArquivo, int largura, int altura) {
      super(nomeArquivo);
      this.altura = altura;
      this.largura = largura;
   }
   @Override
   public String toString() {
      return ("Video: " + getNomeArquivo() + " (" + this.largura + " x " + this.altura + ")");
   }
   @Override
   public ArquivoVideo clone() throws CloneNotSupportedException {
      ArquivoVideo copia = (ArquivoVideo) super.clone();
      return copia;   
   }
}