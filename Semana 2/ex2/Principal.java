import porta.Porta;

public class Principal {
    public static void main(String[] args) {
    Porta porta1 = new Porta();
    porta1.setNome("Porta da cozinha");
    System.out.println("pegar nome" + porta1.getNome());
    System.out.println("ta aberta?" + porta1.estaAberta());
    System.out.println("abrir" + porta1.abrir());
    System.out.println("abrir" + porta1.abrir());
    System.out.println("fechar" + porta1.fechar());
    System.out.println("fechar" + porta1.fechar());
    }
}
