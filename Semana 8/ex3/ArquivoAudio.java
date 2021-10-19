package multimidia;

public class ArquivoAudio extends ArquivoMultimidia {
   private boolean audioHD;

   public ArquivoAudio(String nomeArquivo, int tamanho, boolean audioHD) {
      super(nomeArquivo, tamanho);
      this.audioHD = audioHD;
   }
   @Override
   public String toString() {
      return "Audio: " + this.getNomeArquivo() + " (" + this.getTamanhoArquivo() + ")";
   }
}
