package classificacao;

public class ListaExemplos {
   private int maxQtd, atualQtd;
   private Exemplo lista[];

   public ListaExemplos(int maxQtd) {
      this.maxQtd = maxQtd;
      this.atualQtd = 0;
      this.lista = new Exemplo[maxQtd];
   }
   public void adicionarExemplo(Exemplo exemplo) {
      if(this.atualQtd == this.maxQtd)
         return;
      this.lista[atualQtd++] = exemplo;
   }
   public void ordenarPelaDistancia(double[] atributosEntrada) {
      double distanciaI, distanciaK;
      for(int i = 0, fim = this.atualQtd; i < fim - 1; i = 0, fim--) {
         for(int k = i + 1; k < fim; k++, i++) {
            distanciaI = this.lista[i].calcularDistancia(atributosEntrada, lista[i].getAtributosEntrada());
            distanciaK = this.lista[k].calcularDistancia(atributosEntrada, lista[k].getAtributosEntrada());
            if(distanciaI > distanciaK) {
               Exemplo tmp = this.lista[i];
               this.lista[i] = this.lista[k];
               this.lista[k] = tmp;
            }
         }
      }
   }
   public int getQtdExemplos() {
      return this.atualQtd;
   }
   public Exemplo[] getExemplos() {
      Exemplo[] retorno = new Exemplo[this.atualQtd];

      for(int i = 0; i < retorno.length; i++)
         retorno[i] = this.lista[i];
      return retorno;
   }
   public Exemplo[] getPrimeirosExemplos(int n) {
      Exemplo[] retorno;
      if(this.atualQtd < n)
         retorno = new Exemplo[this.atualQtd];
      else
         retorno = new Exemplo[n];
      
      for(int i = 0; i < retorno.length; i++)
         retorno[i] = this.lista[i];
      return retorno;
   }
   public Exemplo[] getUltimosExemplos(int n) {
      Exemplo[] retorno;
      if(this.maxQtd < n)
         retorno = new Exemplo[this.maxQtd];
      else
         retorno = new Exemplo[n];

      for(int i = 0, k = this.atualQtd - retorno.length; i < retorno.length; i++, k++)
         retorno[i] = this.lista[k];
      return retorno;
   }
}

class Exemplo {
   private double[] atributosEntrada;
   private int rotuloClasse;

   public Exemplo(double[] atributosEntrada, int rotuloClasse) {
      this.atributosEntrada = new double[atributosEntrada.length];
      for(int i = 0; i < atributosEntrada.length; i++)
         this.atributosEntrada[i] = atributosEntrada[i];
      this.rotuloClasse = rotuloClasse;
   }
   public double[] getAtributosEntrada() {
      return this.atributosEntrada;
   }
   public int getRotuloClasse() {
      return this.rotuloClasse;
   }
   public double calcularDistancia(double[] atributosDistancia, double[] atributosEntrada) {
      double soma = 0;
      for(int i = 0; i < atributosDistancia.length; i++)
         soma += (atributosDistancia[i] - atributosEntrada[i])*(atributosDistancia[i] - atributosEntrada[i]);
      return Math.sqrt(soma);
   }
}
