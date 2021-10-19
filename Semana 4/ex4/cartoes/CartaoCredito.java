package cartoes;

public class CartaoCredito extends CartaoDebito {
    protected double divida;

    public CartaoCredito() {
        this.divida = 0;
    }
    public boolean pagarComCredito(double valor) {
        this.divida += valor;
        return true;
    }
    public void quitarCredito(double valor) {
        this.divida -= valor;
    }
    public double verificarExtrato() {
        return this.divida;
    }
}