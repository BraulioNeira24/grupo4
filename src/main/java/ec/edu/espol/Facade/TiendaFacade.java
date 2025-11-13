package ec.edu.espol.Facade;

public class TiendaFacade {
    private SistemaPresencial sistema;

    public TiendaFacade() {
        sistema = new SistemaPresencial();
    }

    public void procesarCompra(String canal) {
        System.out.println("Canal activo: " + canal);
        sistema.realizarCompra();
    }

}
