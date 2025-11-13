package ec.edu.espol.Facade;

public class CanalWeb {

	private TiendaFacade fachada;

    public CanalWeb(TiendaFacade fachada) {
        this.fachada = fachada;
    }

    public void autenticar() {
        System.out.println("Autenticando usuario en canal web...");
    }

    public void renderizarUI() {
        System.out.println("Mostrando interfaz web...");
    }

    public void realizarCompra() {
        autenticar();
        renderizarUI();
        fachada.procesarCompra("web");
    }
}

