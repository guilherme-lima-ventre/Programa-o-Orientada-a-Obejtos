import dispositivos.*;

public class Principal {
    public static void main(String[] args) {
        GerenciarLampadas teste = new GerenciarLampadas();
        //teste.ligarLampada(4);
        //teste.desligarLampada(2);
        teste.desligarTodasLampadas();
        teste.ligarTodasLampadas();
    }
}
