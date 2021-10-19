package matematica;

public class Fracao {
    private int numerador, denominador;

    public Fracao() {
        this.numerador = 1;
        this.denominador = 1;
    }
    public Fracao(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplifica();
    }
    public void simplifica() {
        while(this.numerador % 2 == 0 && this.denominador % 2 == 0) {
            this.numerador = this.numerador / 2;
            this.denominador = this.denominador / 2;
        }
        if(this.numerador >= this.denominador) {
            for(int i = 3; i < this.numerador; i = i + 2) {
                while(this.numerador % i == 0 && this.denominador % i == 0) {
                    this.numerador = this.numerador / i;
                    this.denominador = this.denominador / i;
                }
            }
        }
        else {
            for(int i = 3; i < this.denominador; i = i + 2) {
                while(this.numerador % i == 0 && this.denominador % i == 0) {
                    this.numerador = this.numerador / i;
                    this.denominador = this.denominador / i;
                }
            }
        }
    }
    public String getRepresentacao() {
        return (this.numerador + "/" + this.denominador);
    }
    public Fracao somar(Fracao f2) {
        Fracao f3 = new Fracao();
        f3.denominador = this.denominador * f2.denominador;
        f3.numerador = (f3.denominador/this.denominador)*this.numerador + (f3.denominador/f2.denominador)*f2.numerador;
        f3.simplifica();
        return f3;
    }
    public static Fracao somar(Fracao f1, Fracao f2) {
        Fracao f3 = new Fracao();
        f3.denominador = f1.denominador * f2.denominador;
        f3.numerador = (f3.denominador/f1.denominador)*f1.numerador + (f3.denominador/f2.denominador)*f2.numerador;
        f3.simplifica();
        return f3;
    }
    public static Fracao somar(Fracao[] fracoes) {
        if(fracoes[0] != null && fracoes[1] != null) {
            Fracao fTotal = new Fracao();
            fTotal = somar(fracoes[0], fracoes[1]);
            for(int i = 2; i < fracoes.length; i++) {
                fTotal = somar(fTotal, fracoes[i]);
            }
            fTotal.simplifica();
            return fTotal;
        }
        else {
            if(fracoes[0] != null && fracoes[1] == null) {
                fracoes[0].simplifica();
                return (fracoes[0]);
            }
            return null;
        }
    }
    public static Fracao multiplicar(Fracao f1, Fracao f2) {
        Fracao f3 = new Fracao();
        f3.denominador = f1.denominador * f2.denominador;
        f3.numerador = f1.numerador * f2.numerador;
        f3.simplifica();
        return f3;
    }
}
