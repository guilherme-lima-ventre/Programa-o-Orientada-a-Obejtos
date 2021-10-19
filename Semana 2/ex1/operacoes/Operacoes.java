package operacoes;

public class Operacoes {
    private int max, min, a, b, c, soma2, soma3, multiplica;
    boolean minFeito = false, maxFeito = false;

    public void setMax(int checar) {
        if(maxFeito) {
            if(checar > max)
                max = checar;
        }
        else {
            max = checar;
            maxFeito = true;
        }
    }
    public void setMin(int checar) {
        if(minFeito) {
            if(checar < min)
                min = checar;
        }
        else {
            min = checar;
            minFeito = true;
        }
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int soma2() {
        this.soma2 = this.a + this.b;
        setMin(this.soma2);
        setMax(this.soma2);
        return this.soma2;
    }
    public int soma3() {
        this.soma3 = this.a + this.b + this.c;
        setMin(this.soma3);
        setMax(this.soma3);
        return this.soma3;
    }
    public int multiplica() {
        this.multiplica = this.a * this.b;
        setMin(this.multiplica);
        setMax(this.multiplica);
        return this.multiplica;
    }
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }
}
