package multimidia;

public class Playlist implements Cloneable {
   private ArquivoMultimidia[] listaArquivos;
   private int indiceAtual;

   public Playlist() {
      listaArquivos = new ArquivoMultimidia[100];
      indiceAtual = 0;
   }
   public void adicionarItem(ArquivoMultimidia arquivo) {
      this.listaArquivos[indiceAtual++] = arquivo;
   }
   public void renomearItem(int indiceArquivo, String novoNomeArquivo) {
      this.listaArquivos[indiceArquivo].setNomeArquivo(novoNomeArquivo); 
   }
   public void moverParaInicio(int indiceArquivo) {
      ArquivoMultimidia tmp;
      int i;
      for(i = 1; i <= indiceArquivo; i++) {
         if(i < indiceAtual) {
            tmp = this.listaArquivos[i];
            this.listaArquivos[i] = this.listaArquivos[0];
            this.listaArquivos[0] = tmp;
         }
      }
   }
   public String[] listarArquivos() {
      String listarArquivos[] = new String[indiceAtual];
      for(int i = 0; i < this.indiceAtual; i++) {
         listarArquivos[i] = this.listaArquivos[i].getNomeArquivo();
      }
      return listarArquivos;
   }
   @Override
   public Playlist clone() throws CloneNotSupportedException {
      Playlist copia = (Playlist) super.clone();
      copia.listaArquivos = this.listaArquivos.clone();
      for(int i = 0; i < this.indiceAtual; i++) {
         copia.listaArquivos[i] = this.listaArquivos[i].clone();
      }
      return copia;
   }
}
