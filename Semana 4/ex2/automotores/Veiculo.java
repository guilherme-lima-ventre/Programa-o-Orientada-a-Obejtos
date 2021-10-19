package automotores;

public class Veiculo {
    protected String modelo;

    public Veiculo() {
        this.modelo = new String();
    }
    public String getTipo() {
        return "Veiculo generico modelo " + this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
