import operacoes.Operacoes;

public class Principal {
    public static void main(String[] args) {
        Operacoes objeto1 = new Operacoes();
        objeto1.setA(-2);
        objeto1.setB(1);
        System.out.println(objeto1.soma2());
        System.out.println(objeto1.getMin());
        System.out.println(objeto1.getMax());

        Operacoes objeto2 = new Operacoes();
        objeto2.setA(2);
        objeto2.setB(-90);
        System.out.println(objeto2.multiplica());
        System.out.println(objeto2.getMin());
        System.out.println(objeto2.getMax());
        objeto2.setA(80);
        objeto2.setB(2);
        System.out.println(objeto2.multiplica());
        System.out.println(objeto2.getMin());
        System.out.println(objeto2.getMax());
    }    
}
