package automotores;

public class Carro extends Veiculo {
    private int nPortas;

    @Override
    public String getTipo() {
        return "Carro modelo " + this.modelo;
    }
    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNumeroPortas(int nPortas) {
        this.nPortas = nPortas;
    }
    public int getNumeroPortas() {
        return this.nPortas;
    }
}
