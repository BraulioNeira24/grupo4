package ec.edu.espol.Facade;

public class CanalTelefonico {
    private TiendaFacade fachada;

    public CanalTelefonico(TiendaFacade fachada) {
        this.fachada = fachada;
    }

    public void atenderLlamada() {
        System.out.println("Atendiendo llamada del cliente...");
    }

    public void leerEntradaVoz() {
        System.out.println("Leyendo solicitud del cliente...");
    }

    public void realizarCompra() {
        atenderLlamada();
        leerEntradaVoz();
        fachada.procesarCompra("telefónico");
    }
}

