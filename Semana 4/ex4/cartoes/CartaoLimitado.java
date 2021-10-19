package cartoes;

public class CartaoLimitado extends CartaoCredito {
    protected double limite;

    public CartaoLimitado() {
        this.limite = 200;
    }
    public boolean pagarComCredito(double valor) {
        if(this.divida + valor <= this.limite) {
            this.divida += valor;
            return true;
        }
        return false;
    }
}