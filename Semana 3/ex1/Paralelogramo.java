public class Paralelogramo {
    private int area;
    private String tipo;
    
    public Paralelogramo(int ladoA) {
        this.area = ladoA * ladoA;
        this.tipo = "Paralelogramo quadrado";
    }
    public Paralelogramo(int ladoA, int ladoB) {
        if(ladoA == ladoB)
            this.tipo = "Paralelogramo quadrado";
        else
            this.tipo = "Paralelogramo retangulo";
        this.area = ladoA * ladoB;
    }
    public int getArea() {
        return this.area;
    }
    public String getTipo() {
        return this.tipo;
    }
}
