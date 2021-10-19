package navegador;

public class Navegador {
   protected int limiteAbas, qtdAbasAtuais;
   protected AbaNavegador abasAbertas[];

   public Navegador(int limiteAbas) {
      this.limiteAbas = limiteAbas;
      this.qtdAbasAtuais = 0;
      this.abasAbertas = new AbaNavegador[limiteAbas];
   }
   public AbaNavegador abrirAba(int tipo, String titulo) {
      if(limiteAbas == qtdAbasAtuais)
         return null;
      if(tipo == 1) {
         this.abasAbertas[qtdAbasAtuais++] = new AbaBuscador(titulo);
      }
      else if(tipo == 2) {
         this.abasAbertas[qtdAbasAtuais++] = new AbaRedeSocial(titulo);
      }
      else
         return null;
      return this.abasAbertas[qtdAbasAtuais - 1];
   }
   public void fecharAba(AbaNavegador aba) {
      int abaFechada = -1;
      for(int i = 0; i < this.qtdAbasAtuais; i++) {
         if(aba == this.abasAbertas[i] && abaFechada == -1){
            abaFechada = i;
         }
         if(abaFechada != -1 && i + 1 < this.qtdAbasAtuais) {
            this.abasAbertas[i] = this.abasAbertas[i + 1];
         }
         else if(abaFechada != -1 && i + 1 == this.qtdAbasAtuais) {
            this.abasAbertas[i] = null;
            this.qtdAbasAtuais--;
         }
      }
   }
   public String[] getAbas() {
      String abas[] = new String[this.qtdAbasAtuais];
      for(int i = 0; i < this.qtdAbasAtuais; i++) {
         abas[i] = (this.abasAbertas[i].getTipo() + " " + this.abasAbertas[i].getTitulo());
      }
      return abas;
   }
   public String[] getHistorico() {
      return AbaNavegador.getHistorico();
   }
}
