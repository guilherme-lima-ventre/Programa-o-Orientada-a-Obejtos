package classificacao;

public class KNN {
   private int k;
   ListaExemplos lista;
   
   public KNN(int k) {
      this.k = k;
      this.lista = null;
   }
   public void setDadosTreinamento(ListaExemplos lista) {
      this.lista = lista;
   }
   public int predizer(double[] atributosEntrada) throws Exception {
      if(this.lista == null || this.lista.getQtdExemplos() == 0)
         throw new Exception("Dados de treinamento - nao inicializado.");
      
      Exemplo copiaExemplos[] = lista.getExemplos();
      if(atributosEntrada.length != copiaExemplos[0].getAtributosEntrada().length)
         throw new ExcecaoDadosInvalidos(copiaExemplos[0].getAtributosEntrada().length, atributosEntrada.length);

      this.lista.ordenarPelaDistancia(atributosEntrada);
      Exemplo kPrimeirosExemplos[] = this.lista.getPrimeirosExemplos(this.k);
      int rotulosDeClasse[] = new int[this.k];
      for(int i = 0; i < k; i++) {
         rotulosDeClasse[i] = kPrimeirosExemplos[i].getRotuloClasse();
      }

      int cont, rotuloMaisFrequente = 0, qtdRotuloMaisFrequente = 0;
      for(int i = 0; i < rotulosDeClasse.length; i++) {
         cont = contarFrequencia(rotulosDeClasse, i);
         if(cont > qtdRotuloMaisFrequente) {
            rotuloMaisFrequente = rotulosDeClasse[i];
            qtdRotuloMaisFrequente = cont;
         }
      }

      return rotuloMaisFrequente;
   }
   public int contarFrequencia(int[] rotulosDeClasse, int i) {
      int cont = 0;

      for(int k = 0; k < rotulosDeClasse.length; k++) {
         if(rotulosDeClasse[i] == rotulosDeClasse[k])
            cont++;
      }

      return cont;
   }
}
class ExcecaoDadosInvalidos extends Exception {
   private int qtdAtributosTreinamento, qtdAtributosPredizer;

   public ExcecaoDadosInvalidos(int qtdAtributosTreinamento, int qtdAtributosPredizer) {
      this.qtdAtributosTreinamento = qtdAtributosTreinamento;
      this.qtdAtributosPredizer = qtdAtributosPredizer;
   }
   public int getQtdAtributosTreinamento() {
      return this.qtdAtributosTreinamento;
   }
   public int getQtdAtributosPredizer() {
      return qtdAtributosPredizer;
   }
}
