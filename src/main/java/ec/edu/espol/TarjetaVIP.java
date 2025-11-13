package ec.edu.espol;

public class TarjetaVIP extends TarjetaCredito {
    public TarjetaVIP() {
        super(100.0, 10000.0);
    }

    @Override
    public void operar() {
        System.out.println("Operando con Tarjeta VIP. Límite: " + getLimiteCredito());
    }
}
