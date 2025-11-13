package ec.edu.espol;

public class CreadorTarjetaPremium extends Creador {
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaPremium();
    }
}
