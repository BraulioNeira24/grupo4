package ec.edu.espol.Facade;

public class CanalMovil {
    private TiendaFacade fachada;

    public CanalMovil(TiendaFacade fachada) {
        this.fachada = fachada;
    }

    public void sincronizar() {
        System.out.println("Sincronizando datos con la app móvil...");
    }

    public void mostrarApp() {
        System.out.println("Mostrando interfaz móvil...");
    }

    public void realizarCompra() {
        sincronizar();
        mostrarApp();
        fachada.procesarCompra("móvil");
    }
}

