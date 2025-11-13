package ec.edu.espol;

public abstract class Creador {

    public abstract TarjetaCredito crearTarjeta();

    public void habilitarTarjeta() {
        TarjetaCredito tarjeta = crearTarjeta();
        tarjeta.operar();
    }
}
