package multimidia;

public class ArquivoAudio extends ArquivoMultimidia implements Cloneable {
   private boolean audioHD;

   public ArquivoAudio(String nomeArquivo, boolean audioHD) {
      super(nomeArquivo);
      this.audioHD = audioHD;
   }
   @Override
   public String toString() {
      return ("Audio: " + getNomeArquivo() + " (HD = " + this.audioHD + ")");
   }
   @Override
   public ArquivoAudio clone() throws CloneNotSupportedException {
      ArquivoAudio copia = (ArquivoAudio) super.clone();
      return copia;   
   }
}
