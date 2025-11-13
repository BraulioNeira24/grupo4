package ec.edu.espol;

public class CreadorTarjetaVIP extends Creador {
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaVIP();
    }
}
