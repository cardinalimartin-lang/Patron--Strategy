public class ProcesadorDePagos {
    private EstrategiaPago estrategiaPago;

    // Inyección de la estrategia
    public void setEstrategiaPago(EstrategiaPago estrategia) {
        this.estrategiaPago = estrategia; // permite alterar el motor de pago en tiempo de ejecución
    }

    public void realizarPago(double monto) {
        if (this.estrategiaPago == null) {
            throw new IllegalStateException("Seleccione método de pago.");
        }
        this.estrategiaPago.procesarPago(monto);
    }
}