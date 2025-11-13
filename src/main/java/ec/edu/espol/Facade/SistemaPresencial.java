package ec.edu.espol.Facade;

public class SistemaPresencial {
    public void realizarCompra() {
        System.out.println("Compra registrada en el sistema presencial.");
    }

    public void realizarReembolso() {
        System.out.println("Reembolso procesado en el sistema presencial.");
    }

    public static void main(String[] args) {
        TiendaFacade fachada = new TiendaFacade();

        CanalWeb canalWeb = new CanalWeb(fachada);
        CanalMovil canalMovil = new CanalMovil(fachada);
        CanalTelefonico canalTel = new CanalTelefonico(fachada);

        // Solo uno se usa a la vez:
        canalWeb.realizarCompra();
        // canalMovil.realizarCompra();
        // canalTel.realizarCompra();
    }
}
