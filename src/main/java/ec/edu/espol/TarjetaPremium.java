package ec.edu.espol;

public class TarjetaPremium extends TarjetaCredito {
    public TarjetaPremium() {
        super(50.0, 2000.0);
    }

    @Override
    public void operar() {
        System.out.println("Operando con Tarjeta Premium. Límite: " + getLimiteCredito());
    }
}
