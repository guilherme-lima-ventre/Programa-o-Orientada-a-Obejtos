import dispositivos.*;

public class GerenciadorLampadas {
   private LampadaInteligente lista[] = new LampadaInteligente[10];
   private int tamAtual = 0;

   public void adicionarLampada() throws Exception {
      LampadaInteligente nova = new LampadaInteligente();
      lista[tamAtual++] = nova;
   }
   public void ligarLampada(int indiceLampada) {
      if(lista[indiceLampada].getEstado() == false)
         lista[indiceLampada].ligar();
      else
         throw new LampadaEstaLigada();
   }
   public void desligarLampada(int indiceLampada) {
      if(lista[indiceLampada].getEstado() == true)
         lista[indiceLampada].desligar();
      else
         throw new LampadaEstaDesligada();
   }
}

class LampadaEstaDesligada extends Exception {
   public LampadaEstaDesligada() {
      super("A lampada ja esta desligada.");
   }
}

class LampadaEstaLigada extends Exception {
   public LampadaEstaLigada() {
      super("A lampada ja esta desligada.");
   }
}
