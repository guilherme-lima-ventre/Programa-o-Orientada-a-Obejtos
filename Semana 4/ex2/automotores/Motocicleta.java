package automotores;

public class Motocicleta extends Veiculo {
    private boolean temCarroLateral;

    @Override
    public String getTipo() {
        return "Motocicleta modelo " + this.modelo;
    }
    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setTemCarroLateral(boolean temCarroLateral) {
        this.temCarroLateral = temCarroLateral;
    }
    public int getTemCarroLateral() {
        return this.temCarroLateral;
    }
}
