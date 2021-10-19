package empresa;

public class Pedido {
    private boolean cancelado = false, entregue = false;
    private int pedido[] = new int[5];

    public int contarProdutos(int pedidos[]) {
        int qtdProdutos = 0;
        for(int i = 0; i < 5; i++) {
            if(this.pedido[i] != 0)
                qtdProdutos++;
        }
        return qtdProdutos;
    }
    public boolean adicionarProduto(int codProduto) {
        if(this.cancelado || this.entregue)
            return false;
        int i = contarProdutos(this.pedido);
        if(i == 5)
            return false;
        this.pedido[i] = codProduto;
        return true;
    }
    public int[] entregar() {
        if(this.cancelado || this.entregue)
            return null;
        int i = contarProdutos(this.pedido);
        if(i > 0) {
            int entregar[] = new int[i];
            for(int k = 0; k < i; k++)
                entregar[k] = this.pedido[k];
            this.entregue = true;
            return entregar;
        }
        return null;
    }
    public boolean cancelar() {
        if(this.cancelado || this.entregue)
            return false;
        this.cancelado = true;
        return true;
    }
    public boolean somarPedido(Pedido p) {
        int qtdIguais = 0, maiorI = 0, maiorK = 0, addIguais = 0;
        for(int i = 0; i < 5; i++) {
            for(int k = 0; k < 5; k++) {
                if(this.pedido[i] == p.pedido[k] && this.pedido[i] != 0)
                    qtdIguais++;
            }
            if(this.pedido[i] != 0)
                maiorI++;
            if(p.pedido[i] != 0)
                maiorK++;
        }
        if(maiorI + maiorK - qtdIguais <= 5) {
            for(int k = 0; k < maiorK; k++) {
                for(int i = 0; i < maiorI; i++) {
                    if(p.pedido[k] == this.pedido[i])
                        break;
                    if(i == maiorI - 1) {
                        this.pedido[maiorI + addIguais] = p.pedido[k];
                        addIguais++;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
