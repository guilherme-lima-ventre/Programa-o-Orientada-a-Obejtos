public class ContaCorrente {
    private String nome;
    private double saldo;
    private static int qtdContas = 0;

    public ContaCorrente(String nome) {
        this.nome = nome;
        this.saldo = 0;
        qtdContas++;
    }
    public ContaCorrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        qtdContas++;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getTitular() {
        return this.nome;
    }
    public boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo += valor;
            return true;
        }
        else
            return false;
    }
    public boolean sacar(double valor) {
        if(valor >= 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        else
            return false;
    }
    public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor) {
        if(valor >= 0 && de.saldo >= valor) {
            de.saldo -= valor;
            para.saldo += valor;
            return true;
        }
        else
            return false;
    }
    public static int getQuantidadeContas() {
        return qtdContas;
    }
}
