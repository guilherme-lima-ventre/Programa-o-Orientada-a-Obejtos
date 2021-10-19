package quadrilateros;

public class Quadrilatero {
    protected double ladoAB, ladoBC, ladoCD, ladoDA;

    public void setLados(double ladoAB, double ladoBC, double ladoCD, double ladoDA) {
        this.ladoAB = ladoAB;
        this.ladoBC = ladoBC;
        this.ladoCD = ladoCD;
        this.ladoDA = ladoDA;
    }
    public double getPerimetro() {
        return this.ladoAB + this.ladoBC + this.ladoCD + this.ladoDA;
    }
    public String getPropriedades() {
        return "Figura de quatro lados.";
    }
}
