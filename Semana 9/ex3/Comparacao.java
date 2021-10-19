package geometria;

public class Comparacao {
   public static <T extends Comparable<T>> T maiorElemento(T[] v) {
      if(v == null)
         return null;
      int i = 0;
      T maior = v[i];
      while(i < v.length) {
         if(v[i].compareTo(maior) > 0)
            maior = v[i];
         i++;
      }
      return maior;
   }
   public static <T extends Comparable<T>> T menorElemento(T[] v) {
      if(v == null)
         return null;
      int i = 0;
      T menor = v[i];
      while(i < v.length) {
         if(v[i].compareTo(menor) < 0)
            menor = v[i];
         i++;
      }
      return menor;
   }
}
