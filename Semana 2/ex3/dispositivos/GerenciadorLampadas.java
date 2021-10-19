package dispositivos;

public class GerenciadorLampadas {
    private LampadaInteligente vetor[] = new LampadaInteligente[10];
    private int i = 0;

    public void adicionarLampada() {
        LampadaInteligente lampada = new LampadaInteligente();
        vetor[this.i++] = lampada;
    }
    public void ligarLampada(int indiceLampada) {
        if(vetor[indiceLampada].getEstado())
            return;
        vetor[indiceLampada].ligar();
    }
    public void desligarLampada(int indiceLampada) {
        if(vetor[indiceLampada].getEstado())
            vetor[indiceLampada].desligar();
    }
    public void ligarTodasLampadas() {
        for(int i = 0; i < this.i; i++)
            ligarLampada(i);
    }
    public void desligarTodasLampadas() {
        for(int i = 0; i < this.i; i++)
            desligarLampada(i);
    }
}
