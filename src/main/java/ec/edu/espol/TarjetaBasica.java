package ec.edu.espol;

public class TarjetaBasica extends TarjetaCredito {
    public TarjetaBasica() {
        super(20.0, 500.0);
    }

    @Override
    public void operar() {
        System.out.println("Operando con Tarjeta Básica. Límite: " + getLimiteCredito());
    }
}
