package ec.edu.espol;

public class CreadorTarjetaBasica extends Creador {
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaBasica();
    }
}
