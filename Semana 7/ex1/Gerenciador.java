package dispositivos;

abstract class DispositivoInteligente {
   protected boolean estado;

   public DispositivoInteligente() {
      this.estado = false;
   }
   public void ligar() {
      this.estado = true;
   }
   public void desligar() {
      this.estado = false;
   }
   public boolean getEstado() {
      return this.estado;
   }
}

class LampadaInteligente extends DispositivoInteligente {
   
   public LampadaInteligente() {
      super();
   }
   public void ligar() {
      super.ligar();
   }
   public void desligar() {
      super.desligar();
   }
   public boolean getEstado() {
      return super.getEstado();
   }
}
class TomadaInteligente extends DispositivoInteligente {

   public TomadaInteligente() {
      super();
   }
   public void ligar() {
      super.ligar();
   }
   public void desligar() {
      super.desligar();
   }
   public boolean getEstado() {
      return super.getEstado();
   }
}
class InterruptorInteligente extends DispositivoInteligente {

   public InterruptorInteligente() {
      super();
   }
   public void ligar() {
      super.ligar();
   }
   public void desligar() {
      super.desligar();
   }
   public boolean getEstado() {
      return super.getEstado();
   }
}
public class Gerenciador {
   private DispositivoInteligente[] lista;
   private int indiceAtual;
   
   public Gerenciador() {
      this.lista = new DispositivoInteligente[10];
      this.indiceAtual = 0;
   }
   public void adicionarDispositivo(DispositivoInteligente d) {
      if(this.indiceAtual < 10)
         this.lista[this.indiceAtual++] = d;
   }
   public void ligarTodosDispositivos() {
      for(int i = 0; i < this.indiceAtual; i++) {
         this.lista[i].ligar();
      }
   }
   public void desligarTodosDispositivos() {
      for(int i = 0; i < this.indiceAtual; i++) {
         this.lista[i].desligar();
      }
   }
}
