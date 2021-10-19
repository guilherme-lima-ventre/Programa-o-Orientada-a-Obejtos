package dispositivos;

public class LampadaInteligente {
    private boolean estado = true;

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
