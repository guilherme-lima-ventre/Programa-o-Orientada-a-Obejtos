package porta;

public class Porta {
    private boolean aberta = true;
    private String nome = "Porta sem nome";

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public boolean estaAberta() {
        if(this.aberta)
            return true;
        else
            return false;
    }
    public int abrir() {
        if(this.aberta)
            return 1;
        else {
            this.aberta = true;
            return 0;
        }
    }
    public int fechar() {
        if(this.aberta) {
            this.aberta = false;
            return 0;
        }
        else
            return 1;
    }
}
