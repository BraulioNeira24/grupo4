package ec.edu.espol;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        Creador creadorBasica = new CreadorTarjetaBasica();
        Creador creadorPremium = new CreadorTarjetaPremium();
        Creador creadorVIP = new CreadorTarjetaVIP();

        creadorBasica.habilitarTarjeta();
        creadorPremium.habilitarTarjeta();
        creadorVIP.habilitarTarjeta();
    }
}
